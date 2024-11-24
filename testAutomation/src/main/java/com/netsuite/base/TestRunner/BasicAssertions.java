package com.netsuite.base.TestRunner;

import com.netsuite.base.Logger.Log;
import com.netsuite.base.Reporting.ErrorCollector;
import org.hamcrest.Matchers;


public class BasicAssertions
{
	protected final Log log;
	private final ErrorCollector errorCollector;

	public BasicAssertions(Log testLogger)
	{
		this.log = testLogger;

		this.errorCollector = ErrorCollector.getInstance();
		errorCollector.setLog(testLogger);
	}

	public boolean checkTrue(String message, boolean actual) {
		return this.errorCollector.checkThat("Check True", message, actual, Matchers.is(Matchers.equalTo(true)));
	}

	public boolean checkFalse(String message, boolean actual) {
		return this.errorCollector.checkThat("Check False", message, actual, Matchers.is(Matchers.equalTo(false)));
	}

	public boolean checkEquals(String message, String actual, String expected) {
		return this.errorCollector.checkThat("Check Compares Equal", message, actual, Matchers.is(Matchers.comparesEqualTo(expected)));
	}

	public boolean checkNotEquals(String message, String actual, String expected) {
		return this.errorCollector.checkThat("Check Not Equals", message, actual, Matchers.not(Matchers.equalTo(expected)));
	}
}
