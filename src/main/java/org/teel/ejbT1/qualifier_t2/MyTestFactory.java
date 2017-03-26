package org.teel.ejbT1.qualifier_t2;

import javax.enterprise.inject.Produces;

public class MyTestFactory {

	@Produces
	@MyTest(TestType.COMPLEX)
	public AbstractMyTest getMyComplexTestType(MyComplexTest mct) {
		return mct;
	}

	@Produces
	@MyTest(TestType.SIMPLE)
	public AbstractMyTest getMySimpleTestType(MySimpleTest mst) {
		return mst;
	}
}
