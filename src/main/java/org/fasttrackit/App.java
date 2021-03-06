package org.fasttrackit;

import org.fasttrackit.exception.InvalidOptionSelectedException;
import org.fasttrackit.service.Game;

public class App
{
    public static void main( String[] args ) throws InvalidOptionSelectedException {
        Game game = new Game();
        game.start();

        /*
        //polymorphism
        Vehicle vehicle = new CheatingVehicle();
        vehicle.setMake("Cheating vehicle");

        //object type determines method implementation
        vehicle.accelerate(60,1);

        System.out.println("Accelerate with one param");
        vehicle.accelerate(60);

        //variable type determines what methods are invoked
        //type casting
        if(vehicle instanceof CheatingVehicle) {
            ((CheatingVehicle)vehicle).cheat();
        }*/

//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalVehicleCount = 1;

//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.totalVehicleCount = 4;

//        Vehicle.totalVehicleCount = 10;

//        System.out.println("Total count from vehicle1: " + vehicle1.totalVehicleCount);
//        System.out.println("Total count from vehicle2: " + vehicle2.totalVehicleCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalVehicleCount);

//        String pool
//        String a = "test";
//        String literals
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a equals c: " + a.equals(c));


        //Engine engine = new Engine();
        //engine.manufacturer = "BMW";

        //AutoVehicle autoVehicle = new AutoVehicle(engine);

        //Car car = new Car(engine);

        //System.out.println(car.make = "Dacia");

//        System.out.println( "Welcome to the racing game.");
//
//        Car carReference = new Car();
//        carReference.make = "Volvo";
//        carReference.model = "S90";
//        carReference.mileage = 12.3;
//        carReference.fuelLevel = 67;
//        carReference.color = "Navy Blue";
//        carReference.maxSpeed = 260;
//
//        System.out.println(carReference.make);
//        System.out.println(carReference.model);
//        System.out.println(carReference.mileage);
//        System.out.println(carReference.fuelLevel);
//        System.out.println(carReference.color);
//        System.out.println(carReference.maxSpeed);
//
//        System.out.println(carReference.damaged);
//        System.out.println(carReference.totalTravelledDistance);
//        System.out.println(carReference.doorCount);
//
//        double currentDistance = carReference.accelerate(100, 1);
//
//        System.out.println("Total distance before repair: " + carReference.totalTravelledDistance);
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Total distance after repair: " + carReference.totalTravelledDistance);
//
//
//        System.out.println(carReference.make);
//        System.out.println(carReference.model);
//        System.out.println(carReference.mileage);
//        System.out.println(carReference.fuelLevel);
//        System.out.println(carReference.color);
//        System.out.println(carReference.maxSpeed);
//
//        System.out.println(carReference.damaged);
//        System.out.println(carReference.totalTravelledDistance);
//        System.out.println(carReference.doorCount);
//
//        Car car2 = new Car();
//
//        car2.make = "BMW";
//        car2.model = "CLS";
//        car2.color = "Black";
//
//        double car2Distance = car2.accelerate(120, 3);
//
//        System.out.println(car2.make + " " + carReference.make);
//
//        car2.make = carReference.make;
//
//        System.out.println(carReference.make);
//        System.out.println(car2.make);
//        System.out.println(car2.model);
//        System.out.println(carReference.model);
//
//        car2 = null;
//
//        System.out.println(car2);

//        System.out.println("Modulo example:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
    }
}
