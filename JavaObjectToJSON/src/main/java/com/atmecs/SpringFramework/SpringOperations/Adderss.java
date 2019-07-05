package com.atmecs.SpringFramework.SpringOperations;

public class Adderss {
	String city;
	String state;
	String country;
	public Adderss(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Adderss [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	

}
