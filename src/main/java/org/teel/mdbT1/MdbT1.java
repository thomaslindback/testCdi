package org.teel.mdbT1;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "MdbT1", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/MdbT1Queue"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MdbT1 implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage msg = null;
        try {
            if (message instanceof TextMessage) {
                msg = (TextMessage) message;
                System.out.println("Received Message from queue: " + msg.getText());
            } else {
                System.out.println("Message of wrong type: " + message.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}
