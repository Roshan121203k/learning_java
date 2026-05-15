package com.training.entities;



public class State {
	
	private String code;
	private String name;
	private long population;
	private String country;
	private String capital;
	public State() {
		super();
	}
	public State(String code, String name, long population, String country, String capital) {
		super();
		this.code = code;
		this.name = name;
		this.population = population;
		this.country = country;
		this.capital = capital;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "State [code=" + code + ", name=" + name + ", population=" + population + ", country=" + country
				+ ", capital=" + capital + "]";
	}
	
	
	

}