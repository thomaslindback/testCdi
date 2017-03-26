package org.teel.ejbT1.qualifier_t2;

public class MySimpleTest extends AbstractMyTest {

	@Override
	public boolean doValidate() {
		System.out.println("MySimpleTest");
		return true;
	}

}
