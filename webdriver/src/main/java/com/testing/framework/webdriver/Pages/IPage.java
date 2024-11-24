package com.testing.framework.webdriver.Pages;

public interface IPage
{
	<T extends IPage> T navigateTo();

	<T extends IPage> T navigateToForced();

	String getPageUrl();

	void beforePageLoad();

	void afterPageLoad();

	void waitForPageLoad();
}
