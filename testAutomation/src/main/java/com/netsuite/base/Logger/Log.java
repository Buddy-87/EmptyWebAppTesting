package com.netsuite.base.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log
{
	private Logger log = LoggerFactory.getLogger(Log.class);

	public Log()
	{
		this.log = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}

	public Log(Class javaClass)
	{
		this.log = LoggerFactory.getLogger(javaClass);
	}

	public Log(String className)
	{
		this.log = LoggerFactory.getLogger(className);
	}

	public void info(String message)
	{
		this.log.info(message);
	}

	public void infoFormat(String format, Object... message)
	{
		this.log.info(String.format(format, message));
	}

	public void debug(String message)
	{
		this.log.debug(message);
	}

	public void debugFormat(String format, Object... message)
	{
		this.log.debug(String.format(format, message));
	}

	public void error(String message)
	{
		this.log.error(message);
	}

	public void error(Throwable ex)
	{
		this.log.error("Unexpected error", ex);
	}

	public void error(String message, Throwable t)
	{
		this.log.error(message, t);
	}

	public void errorFormat(String format, Object... message)
	{
		this.log.error(String.format(format, message));
	}

	public void warning(String message)
	{
		this.log.warn(message);
	}

	public void warning(String message, Throwable ex)
	{
		this.log.warn(message, ex);
	}

	public void warning(Throwable ex)
	{
		this.log.warn(String.format("Unexpected error: %s", ex.getMessage()), ex);
	}

	public void warningFormat(String format, Object... message)
	{
		this.log.warn(String.format(format, message));
	}

	public void trace(String message)
	{
		this.log.trace(message);
	}

	public void trace(String message, Throwable ex)
	{
		this.log.trace(message, ex);
	}

	public void trace(Throwable ex)
	{
		this.log.trace(String.format("Unexpected error: %s", ex.getMessage()), ex);
	}

	public void traceFormat(String format, Object... message)
	{
		this.log.trace(String.format(format, message));
	}

	public void logMessage(LogLevel logLevel, String format, Object... message)
	{
		switch (logLevel)
		{
			case Info -> this.infoFormat(format, message);
			case Debug -> this.debugFormat(format, message);
			case Trace -> this.traceFormat(format, message);
			case Warning -> this.warningFormat(format, message);
			case Error -> this.errorFormat(format, message);
		}

	}

	public static enum LogLevel
	{
		Info, Debug, Trace, Warning, Error;

		private LogLevel()
		{
		}
	}
}