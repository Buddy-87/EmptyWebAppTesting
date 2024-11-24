package com.testing.framework.commonApps.factories;

import com.testing.framework.DriverFactory;
import org.openqa.selenium.WebDriver;

public interface IDriverFactory
{
	WebDriver getWebDriver(DriverFactory.BrowserType browserType);

	enum BrowserType
	{
		CHROME, FIREFOX, EDGE, SAFARI, INTERNET_EXPLORER
	}
}
