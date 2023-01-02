package com.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String firstName;
	private String LastName;
	
	private String homeCountry;
	
	private String[] favouriteOS;
	
	private String favProgrammingLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("PT", "Portugal");
		countryOptions.put("US", "USA");
		countryOptions.put("AUS", "Australia");
		countryOptions.put("DE", "Germany");
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getHomeCountry() {
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavProgrammingLanguage() {
		return favProgrammingLanguage;
	}

	public void setFavProgrammingLanguage(String favProgrammingLanguage) {
		this.favProgrammingLanguage = favProgrammingLanguage;
	}

	public String[] getFavouriteOS() {
		return favouriteOS;
	}

	public void setFavouriteOS(String[] favouriteOS) {
		this.favouriteOS = favouriteOS;
	}
	

}
