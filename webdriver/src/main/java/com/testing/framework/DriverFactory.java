package com.testing.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{
	private static WebDriver driver;

	public WebDriver getInstance()
	{
		if (driver == null)
		{
			driver = new ChromeDriver();
		}

		return driver;
	}
}
