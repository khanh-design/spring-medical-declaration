package com.example.springmedicaldeclaration.model;

import java.util.Date;

public class Health_declaration {
    private User user;
    private Vehicle vehicle;
    private Address address;
    private Sicks_Infection  sicksInfection;

    public Health_declaration() {

    }

    public Health_declaration(User user, Vehicle vehicle, Address address, Sicks_Infection sicksInfection) {
        this.user = user;
        this.vehicle = vehicle;
        this.address = address;
        this.sicksInfection = sicksInfection;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Sicks_Infection getSicksInfection() {
        return sicksInfection;
    }

    public void setSicksInfection(Sicks_Infection sicksInfection) {
        this.sicksInfection = sicksInfection;
    }
}
