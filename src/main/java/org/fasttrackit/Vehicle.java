package org.fasttrackit;

public class Vehicle {

    String make;
    String model;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTravelledDistance;
    boolean damaged;

    public double accelerate(double speed, double durationInHours) {
        if(speed > maxSpeed) {
            System.out.println("MaxSpeed exceeded.");
            return 0;
        }
        else if(speed == maxSpeed) {
            System.out.println("Careful MaxSpeed reached.");
        }
        else {
            System.out.println("Valid speed entered.");
        }

        if(damaged) {
            System.out.println("The vehicle is damaged. You cannot accelerate.");
            return 0;
        }


        System.out.println(make + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");

        double distance = speed * durationInHours;
        totalTravelledDistance += distance;

        System.out.println("Total travelled distance: " + totalTravelledDistance + ".");

        double usedFuel = distance * mileage / 100;
        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel + ".");

        return distance;
    }

}
