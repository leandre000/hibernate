package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int lapid;
    private String lapDesc;

    public int getLapid() {
        return lapid;
    }

    public void setLapid(int lapid) {
        this.lapid = lapid;
    }

    public String getLapDesc() {
        return lapDesc;
    }

    public void setLapDesc(String lapDesc) {
        this.lapDesc = lapDesc;
    }
}