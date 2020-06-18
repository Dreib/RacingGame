package org.fasttrackit;

public class Vehicle {

    //class / static variable
    private static int totalVehicleCount;

    //instance variables
    private String make;
    private String model;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double maxSpeed;
    protected double totalTravelledDistance;
    private boolean damaged;

    public Vehicle() {
        totalVehicleCount++;
    }

    //method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

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

        double mileageMultiplier = 1;

        //use more fuel if speed > 120 km/h
        if(speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage / 100;
        usedFuel *= mileageMultiplier;

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel + ".");

        return distance;
    }

    public void makeSound() {
        System.out.println("Make way!!!");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTotalTravelledDistance() {
        return totalTravelledDistance;
    }

    public void setTotalTravelledDistance(double totalTravelledDistance) {
        this.totalTravelledDistance = totalTravelledDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    //read-only variable
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", maxSpeed=" + maxSpeed +
                ", totalTravelledDistance=" + totalTravelledDistance +
                ", damaged=" + damaged +
                '}';
    }
}
