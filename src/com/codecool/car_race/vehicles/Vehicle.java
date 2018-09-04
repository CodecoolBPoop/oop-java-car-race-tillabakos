package com.codecool.car_race.vehicles;

public abstract class Vehicle {
  private String name;
 //TODO add fields

  protected Vehicle() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
