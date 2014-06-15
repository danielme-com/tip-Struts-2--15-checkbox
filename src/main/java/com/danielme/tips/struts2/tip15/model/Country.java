package com.danielme.tips.struts2.tip15.model;

public class Country
{

	private String code;
	
	private String name;
	

	public Country(String code, String name)
	{
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}	
	
}