package com.testing.framework.commonApps.utilities;

public class WaitingUtility
{
	public static void sleepMilliseconds(int milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException ignored)
		{

		}
	}
}
