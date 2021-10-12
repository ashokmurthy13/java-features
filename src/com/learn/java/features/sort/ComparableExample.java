package com.learn.java.features.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("CP", 369, "SIN", "BEJ"));
        flights.add(new Flight("AI", 720, "NRT", "CJB"));
        flights.add(new Flight("AI", 700, "NRT", "SFO"));
        flights.add(new Flight("AI", 700, "SIN", "CJB"));
        flights.add(new Flight("EM", 140, "DBU", "CJB"));
        flights.add(new Flight("MA", 545, "MAL", "GER"));

        Collections.sort(flights);

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
