package com.cartax;

public enum Region {
	    R1("USA"),
	    R2("Europe"),
	    R3("Asia"),
	    R4("Africa");

	    private final String country;

	    Region(String country) {
	        this.country = country;
	    }

	    public String getCountry() {
	        return country;
	    }

}
