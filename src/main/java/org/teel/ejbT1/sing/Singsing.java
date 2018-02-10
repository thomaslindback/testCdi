package org.teel.ejbT1.sing;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.teel.ejbT1.qualifier_t2.AbstractMyTest;
import org.teel.ejbT1.qualifier_t2.MyTest;
import org.teel.ejbT1.qualifier_t2.TestType;

@Singleton
public class Singsing {
	
	@Inject
	@MyTest(TestType.COMPLEX)
	static AbstractMyTest t1;
	
	public void doit2() {
		System.out.println("Singsing::doit2");
		System.out.println(t1);
	}
	
	public static void doit() {
		System.out.println("Singsing::doit");
		System.out.println(t1);
		
		//CDI.current().getBeanManager().
	}
	
}
