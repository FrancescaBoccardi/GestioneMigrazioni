package it.polito.tdp.borders.model;

public class CountryAndNumber implements Comparable<CountryAndNumber>{
	
	private Country country;
	private int number;
	
	
	public CountryAndNumber(Country country, int number) {
		this.country = country;
		this.number = number;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public int compareTo(CountryAndNumber o) {
		// ordine decrescente per numero
		return o.getNumber()-this.number;
	}


	@Override
	public String toString() {
		return country.getStateAbb()+" - "+country.getStateName()+" - "+number;
	}
	
	
	
	
	
}
