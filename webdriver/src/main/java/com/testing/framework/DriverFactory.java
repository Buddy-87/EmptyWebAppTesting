package com.testing.framework;

import com.testing.framework.commonApps.factories.IDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory implements IDriverFactory
{
	String cacheWebDriversPath = System.getProperty("webdriver.browsersCachePath");

	public WebDriver getWebDriver(BrowserType browserType) throws IllegalStateException
	{
		if (cacheWebDriversPath == null || cacheWebDriversPath.isEmpty())
		{
			throw new IllegalStateException("Unable to locate the system property 'webdriver.browsersCachePath'.");
		}

		return switch (browserType)
		{
			case CHROME ->
			{
				WebDriverManager.chromedriver().cachePath(cacheWebDriversPath).setup();
				yield new ChromeDriver();
			}
			case FIREFOX ->
			{
				WebDriverManager.firefoxdriver().cachePath(cacheWebDriversPath).setup();
				yield new FirefoxDriver();
			}
			case EDGE ->
			{
				WebDriverManager.edgedriver().cachePath(cacheWebDriversPath).setup();
				yield new EdgeDriver();
			}
			case SAFARI ->
			{
				WebDriverManager.safaridriver().cachePath(cacheWebDriversPath).setup();
				yield new SafariDriver();
			}
			case INTERNET_EXPLORER ->
			{
				WebDriverManager.iedriver().cachePath(cacheWebDriversPath).setup();
				yield new InternetExplorerDriver();
			}
		};
	}
}
