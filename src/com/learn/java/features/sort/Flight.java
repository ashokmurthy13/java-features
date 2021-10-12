package com.learn.java.features.sort;

public class Flight implements Comparable<Flight> {

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
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    /**
     * compared using one field and multiple fields
     */
    @Override
    public int compareTo(Flight flight) {
        // compare with the single field
        // here we have only one object passed to the compareTo method
        // this.getName() is from the current object
        // f1.compareTo(flight) - here f1 refers to this object
        return this.getName().compareTo(flight.getName());

/*
        // compare with multiple fields
        int result = this.getName().compareTo(flight.getName());
        if (result == 0) {
            result = this.getNumber() - (flight.getNumber());
            if (result == 0) {
                return this.getDestination().compareTo(flight.getDestination());
            }
        }
        return result;
*/
    }
}
