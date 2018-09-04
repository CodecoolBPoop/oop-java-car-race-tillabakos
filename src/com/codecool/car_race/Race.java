package com.codecool.car_race;

import java.util.*;

import com.codecool.car_race.vehicles.Vehicle;
import com.codecool.car_race.vehicles.Truck;

public class Race {
    private final List<Vehicle> vehicles = new LinkedList<>();

    public Race () { createVehicles(); }


    private void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Truck());
        }
    }

    private void printResults() {
//        vehicles.forEach(System.out::println);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
    }

    public static void main(String[] args) {
        Race race = new Race();

        race.createVehicles();
        race.printResults();

    }
}
