package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game.");

        Car carReference = new Car();
        carReference.make = "Volvo";
        carReference.model = "S90";
        carReference.mileage = 12.3;
        carReference.fuelLevel = 67;
        carReference.color = "Navy Blue";
        carReference.maxSpeed = 260;

        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);

        System.out.println(carReference.damaged);
        System.out.println(carReference.totalTravelledDistance);
        System.out.println(carReference.doorCount);

        Car car2 = new Car();

        car2.make = "BMW";
        car2.model = "CLS";
        car2.color = "Black";

        System.out.println(car2.make + " " + carReference.make);

        car2.make = carReference.make;

        System.out.println(carReference.make);
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(carReference.model);

        car2 = null;

        System.out.println(car2);

    }
}
