package com.learn.java.features.equalshashcode;

import java.util.Objects;

public class Flight {

    private String name;
    private int number;
    private String origin;
    private String destination;

    public Flight(String name, int number, String origin, String destination) {
        this.name = name;
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object obj) {
        // this checks the current object with the passed object obj
        // obj1.equals(obj) - here obj1 is "this"
        if (this == obj) return true;
        // checks whether the object is of type Flight(false even if obj is null)
        if (!(obj instanceof Flight)) return false;
        // type case the object to Flight type
        Flight flight = (Flight) obj;
        // check all the value of the object members(fields)
        return getNumber() == flight.getNumber() &&
                getName().equals(flight.getName()) &&
                getOrigin().equals(flight.getOrigin()) &&
                getDestination().equals(flight.getDestination());
    }

    @Override
    public int hashCode() {
        // hashCode will needs to be implemented whenever equals method is implemented - why?
        // failing to do, will not function properly with hash based collections like HashMap, HashSet, Hashtable
        return Objects.hash(getName(), getNumber(), getOrigin(), getDestination());
    }
}
