package com.netsuite.base.Reporting;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import com.netsuite.base.Logger.Log;

import java.util.concurrent.Callable;

public class ErrorCollector
{
	private static ErrorCollector instance;
	private Log log;

	private ErrorCollector()
	{
		this.log = new Log();
	}

	public static ErrorCollector getInstance()
	{
		if (instance == null)
		{
			instance = new ErrorCollector();
		}

		return instance;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public <T> boolean checkThat(String assertionType, String message, final T actual, Matcher<T> expected) {
		return this.checkSucceeds(assertionType, message, () -> actual, expected);
	}

	public <T> boolean checkSucceeds(String assertionType, String message, Callable<T> callable, Matcher<T> expected)
	{
		if (callable == null) {
			throw new NullPointerException("Error obtaining valid callable method.");
		}

		try {
			MatcherAssert.assertThat(message, callable.call(), expected);
			this.log.info(String.format("%s : %s", assertionType, message));
			return true;
		} catch (Throwable ignored) {
			// Collect all errors from assertions here
			// can implement screenshots capture
		}

		return false;
	}
}
