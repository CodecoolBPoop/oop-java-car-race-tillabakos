package com.codecool.car_race.vehicles;

import java.util.Random;

public class Truck extends Vehicle {

  public Truck() { super(Integer.toString(new Random().nextInt(1000))); }

}
