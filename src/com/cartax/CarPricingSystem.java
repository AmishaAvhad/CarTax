package com.cartax;

import java.util.Scanner;

public class CarPricingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the region of origin for the car (R1, R2, R3, R4):");
        String regionInput = scanner.nextLine();

        Region userRegion;
        try {
            userRegion = Region.valueOf(regionInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid region input. Using default region (R1 - USA).");
            userRegion = Region.R3; // Default to Region R3 (Asia) if input is invalid
        }

        System.out.println("Enter the base price of the car:");
        double basePrice = scanner.nextDouble();

        Car userCar = new Car(userRegion.getCountry(), basePrice);

        System.out.println("Car details:");
        System.out.println(userCar);

        scanner.close();
    }
}