package com.learn.java.features.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashcodeDemo {

    public static void main(String[] args) {

        Flight f1 = new Flight("AI", 100, "SFO", "CLT");
        Flight f2 = new Flight("PA", 200, "SFO", "CLT");
        Flight f3 = new Flight("PA", 200, "SFO", "CLT");

        System.out.println(f1.equals(f2)); // false
        System.out.println(f2.equals(f3)); // true

        Map<Flight, String> flightNameMap = new HashMap<>();
        flightNameMap.put(f1, "One");
        flightNameMap.put(f2, "Two");
        // duplicate key is overridden here. if hashCode() is not implementation, this duplicate key will be added to the map, then the map size becomes 3
        // if hashCode() is not implementation, then map treats it as new object and adds it to the map, since hashcode is not there for this key
        flightNameMap.put(f3, "Three");
        System.out.println(flightNameMap.size()); // size: 2
    }
}
