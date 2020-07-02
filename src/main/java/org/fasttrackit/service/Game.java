package org.fasttrackit.service;

import org.fasttrackit.controller.StandardInputController;
import org.fasttrackit.domain.Track;
import org.fasttrackit.domain.vehicle.Vehicle;
import org.fasttrackit.exception.InvalidOptionSelectedException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    private StandardInputController controller = new StandardInputController();

    public void start() throws InvalidOptionSelectedException {
        System.out.println("Welcome to the racing game!");

        initializeTracks();

        Track selectedTrack = getSelectedTrack();
        System.out.println("You have selected: " + selectedTrack.getName());

        initializeCompetitors();

        System.out.println(competitors);
    }

    private void initializeCompetitors() {
        int playerCount = controller.getPlayerCountFromUser();

        for(int i = 1; i <= playerCount; i++) {
            System.out.println("Preparing player " + i + " for the race.");

            Vehicle vehicle = new Vehicle();
            vehicle.setMake(controller.getVehicleMakeFromUser());
            vehicle.setFuelLevel(30);
            vehicle.setMaxSpeed(300);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(9, 15));

            competitors.add(vehicle);
        }
    }

    private Track getSelectedTrack() throws InvalidOptionSelectedException {
        try {
            int optionNumber = controller.getTrackNumberFromUser();
            return tracks[optionNumber - 1];
        } catch (InputMismatchException e) {
            throw new RuntimeException("Invalid value entered.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidOptionSelectedException();
        }
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Street Circuit");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Forest Circuit");
        track2.setLength(100);

        tracks[1] = track2;

        /*Track track3 = new Track();
        track3.setName("Street Circuit");
        track3.setLength(300);

        tracks[2] = track3;*/

        displayTracks();
    }

    private void displayTracks() {
        System.out.println("Available Tracks:");

        //classic for loop
        for(int i = 0; i < tracks.length; i++) {
            if(tracks[i] != null) {
                System.out.println(i + 1 + ". " + tracks[i].getName() + ": " + tracks[i].getLength());
            }
        }
    }

}
