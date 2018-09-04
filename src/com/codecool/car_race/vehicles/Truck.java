package com.codecool.car_race.vehicles;

//import java.util.Random;
import com.codecool.car_race.utils.RandomUtils;

public class Truck extends Vehicle {

  public Truck() {
    this.setName(Integer.toString(RandomUtils.nextInt(1000))); }

}
