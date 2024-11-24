package com.testing.framework.commonApps.factories;

import com.testing.framework.webdriver.Fields.FieldType;
import com.testing.framework.webdriver.Fields.IField;
import org.openqa.selenium.By;

public interface IFieldFactory
{
	<T extends IField> T getField(By getBy, FieldType fieldType);
}
