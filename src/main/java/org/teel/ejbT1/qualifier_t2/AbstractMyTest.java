package org.teel.ejbT1.qualifier_t2;

public abstract class AbstractMyTest {

	protected abstract boolean doValidate();

	public boolean validate() {
		return doValidate();
	}
}
