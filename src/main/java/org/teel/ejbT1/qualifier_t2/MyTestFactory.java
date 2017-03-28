package org.teel.ejbT1.qualifier_t2;

import java.util.Arrays;
import java.util.List;

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
	
	@Produces
	@MyTest(TestType.BOTH)
	public List<AbstractMyTest> getBothTestType(MySimpleTest mst, MyComplexTest mct) {
		return Arrays.asList(mst, mct);
	}

}
