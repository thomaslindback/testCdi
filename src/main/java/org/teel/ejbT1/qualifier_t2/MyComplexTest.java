package org.teel.ejbT1.qualifier_t2;


public class MyComplexTest extends AbstractMyTest {

	@Override
	public boolean doValidate() {
		System.out.println("MyComplexTest");
		return false;
	}

}
