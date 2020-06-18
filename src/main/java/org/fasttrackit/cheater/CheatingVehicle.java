package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class CheatingVehicle extends Vehicle {

    //constant
    public static final String TYPE = "CHEATER";

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getMake() + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");
        System.out.println("Cheating...");

        double distance = speed * durationInHours * 2;
        totalTravelledDistance += distance;

        return distance;
    }

    public void cheat() {
        totalTravelledDistance *= 2;
    }

}
