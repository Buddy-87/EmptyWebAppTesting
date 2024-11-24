package com.netsuite.base;

import com.netsuite.base.Logger.Log;
import com.netsuite.base.TestRunner.BasicAssertions;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTestBase
{
	protected WebDriver webDriver;

	private BasicAssertions basicAssertions;

	public AbstractTestBase(WebDriver webDriver)
	{
		Log logger = new Log();
		this.webDriver = webDriver;
		this.basicAssertions = new BasicAssertions(logger);
	}

	protected boolean checkTrue(String message, boolean actualValue)
	{
		return basicAssertions.checkTrue(message, actualValue);
	}

	protected boolean checkFalse(String message, boolean actualValue)
	{
		return basicAssertions.checkFalse(message, actualValue);
	}
	
	protected boolean checkEquals(String message, String actual, String expected)
	{
        return basicAssertions.checkEquals(message, actual, expected);
    }

	protected boolean checkNotEquals(String message, String actual, String expected)
	{
		return basicAssertions.checkNotEquals(message, actual, expected);
	}
}