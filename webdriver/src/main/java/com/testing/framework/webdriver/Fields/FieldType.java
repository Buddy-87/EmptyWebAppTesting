package com.testing.framework.webdriver.Fields;

public enum FieldType
{
	Button(IButton.class),
	Checkbox(ICheckbox.class),
	Dropdown(IDropdown.class),
	FileUpload(IFileUpload.class),
	FileDownload(IFileDownload.class),
	TextEditor(ITextEditor.class);

	private final Class fieldType;

	FieldType(Class fieldType)
	{
		this.fieldType = fieldType;
	}

	public Class getFieldType()
	{
		return fieldType;
	}
}
