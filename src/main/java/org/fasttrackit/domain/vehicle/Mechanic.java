package org.fasttrackit.domain.vehicle;

public class Mechanic {

    public void repair(Vehicle vehicle) {
        System.out.println("Repairing vehicle " + vehicle.getMake());

        vehicle.setTotalTravelledDistance(vehicle.getTotalTravelledDistance() - 1000);
        vehicle.setDamaged(false);
    }

}
