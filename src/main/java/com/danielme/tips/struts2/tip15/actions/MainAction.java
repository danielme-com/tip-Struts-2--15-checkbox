package com.danielme.tips.struts2.tip15.actions;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.danielme.tips.struts2.tip15.model.Country;
import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport
{

	private static Logger LOG = Logger.getLogger(MainAction.class);

	private static final long serialVersionUID = 1L;

	private boolean checkboxSimple;

	private String[] countries = { getText("Spain"), getText("Mexico"), getText("Germany") };

	private String countriesCheckbox;

	private String[] countriesSelected;
	
	public String execute()
	{
		return INPUT;
	}

	public String submit()
	{
		String[] countries = countriesCheckbox.split(", ");
		for (String country : countries)
		{
			LOG.info(country);
		}
		countriesSelected = countries;
		return INPUT;
	}

	public boolean isCheckboxSimple()
	{
		return checkboxSimple;
	}

	public void setCheckboxSimple(boolean checkboxSimple)
	{
		this.checkboxSimple = checkboxSimple;
	}

	public String[] getCountries()
	{
		return countries;
	}

	public String getCountriesCheckbox()
	{
		return countriesCheckbox;
	}

	public void setCountriesCheckbox(String countriesCheckbox)
	{
		this.countriesCheckbox = countriesCheckbox;
	}

	public String[] getCountriesSelected()
	{
		return countriesSelected;
	}

	public List<Country> getCountriesObject()
	{
		List<Country> countriesObject = new LinkedList<Country>();
		countriesObject.add(new Country("ESP", getText("Spain")));
		countriesObject.add(new Country("MEX", getText("Mexico")));
		countriesObject.add(new Country("DE", getText("Germany")));
		return countriesObject;
	}
	
	

}
