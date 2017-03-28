/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teel.ejbT1;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.teel.ejbT1.qualifier_t2.AbstractMyTest;
import org.teel.ejbT1.qualifier_t2.MyTest;
import org.teel.ejbT1.qualifier_t2.TestType;
import org.teel.ejbT1.sing.Singsing;


/**
 *
 * @author martin
 */
@Stateless
@Remote(NewsessionBeanRemote.class)
public class NewSessionBean implements NewsessionBeanRemote {

	@Inject
	private Injected1 injected1;
	
	@Inject
	@MyTest(TestType.COMPLEX)
	AbstractMyTest t1;
	
	@Inject
	@MyTest(TestType.SIMPLE)
	AbstractMyTest s1;
	
	@Inject
	@MyTest(TestType.BOTH)
	List<AbstractMyTest> both;
	
    /* (non-Javadoc)
	 * @see org.teel.ejbT1.NewsessionBeanRemote#businessMethod()
	 */
    @Override
	public void businessMethod() {
    	System.out.println("------------------------------");
    	System.out.println("NewSessionBean::businessMethod");
    	System.out.println(injected1);
    	if(injected1 != null) {
    		injected1.callMe();
    	}
    	t1.validate();
    	s1.validate();
    	
    	Singsing.doit();
    	
    	System.out.println(both);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
