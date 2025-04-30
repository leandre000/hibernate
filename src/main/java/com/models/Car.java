package com.models;

import jakarta.persistence.*;

@Entity
//@DiscriminatorValue("car")
public class Car extends Vehicle {
    private int numDoors;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumOfDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    private int numOfDoors;
}