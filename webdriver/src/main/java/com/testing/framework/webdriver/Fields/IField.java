package com.testing.framework.webdriver.Fields;

public interface IField
{
	void setValue(String value);

	String getValue();

	String getRawValue();

	boolean exists();

	boolean isVisible();
}
