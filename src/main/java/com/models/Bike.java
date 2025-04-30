package com.models;

import jakarta.persistence.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Id;

@Entity
//@DiscriminatorValue("bike")

public class Bike extends Vehicle {

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    private boolean hasCarrier;


}