package com.cartax;

public class Car {
	 private String country;
	    private double basePrice;
	    private Region region;

	    public Car(String country, double basePrice) {
	        this.country = country;
	        this.basePrice = basePrice;
	        this.region = getRegion();
	    }

	    private Region getRegion() {
	        for (Region r : Region.values()) {
	            if (r.getCountry().equalsIgnoreCase(country)) {
	                return r;
	            }
	        }
	        // If no matching region is found,
	        return Region.R3; // Default to Region R3 (Asia).
	    }

	    public double calculateTax() {
	        // Default tax rate
	        double taxRate = 0.1;

	        // Custom tax rates based on regions
	        if (region == Region.R2) { // Europe
	            taxRate = 0.2;
	        } else if (region == Region.R4) { // Africa
	            taxRate = 0.15;
	        }

	        return basePrice * taxRate;
	    }

	    public double calculateTotalPrice() {
	        return basePrice + calculateTax();
	    }

	    public String toString() {
	        return String.format("Car from %s, Region: %s%nBase Price: $%.2f%nTax: $%.2f%nTotal Price: $%.2f",
	                             country, region.name(), basePrice, calculateTax(), calculateTotalPrice());
	    }

}
