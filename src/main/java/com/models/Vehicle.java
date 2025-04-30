package com.models;

import jakarta.persistence.*;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "vehicle_type",discriminatorType = DiscriminatorType.STRING)
public  class Vehicle {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int vehicleId;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private String manufacturer;
}