package com.learn.java.features.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("CP", 369, "SIN", "BEJ"));
        flights.add(new Flight("AI", 720, "NRT", "CJB"));
        flights.add(new Flight("AI", 700, "NRT", "SFO"));
        flights.add(new Flight("AI", 700, "SIN", "CJB"));
        flights.add(new Flight("EM", 140, "DBU", "CJB"));
        flights.add(new Flight("MA", 545, "MAL", "GER"));

        // using anonymous class
        Comparator<Flight> comp = new Comparator<Flight>() {
            @Override
            public int compare(Flight f1, Flight f2) {
                return f1.getName().compareTo(f2.getName());
            }
        };
        Collections.sort(flights, comp);

        // using lambda
        Comparator<Flight> compLambda = (f1, f2) -> f1.getName().compareTo(f2.getName());
        flights.sort(compLambda);


        // sorted based on flight number using Method Reference = ::
        flights.sort(Comparator.comparingInt(Flight::getNumber));
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        System.out.println("--------------------------------");


        // sort based on multiple fields
        flights.sort(Comparator.comparing(Flight::getName)
                .thenComparingInt(Flight::getNumber)
                .thenComparing(Flight::getOrigin));
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
