package com.testing.framework.webdriver.Fields;

import java.util.List;

public interface IDropdown extends IField
{
	List<String> getAllValues();

	List<String> getAllRawValues();

	default void select(String item)
	{
		this.setValue(item);
	}
}
