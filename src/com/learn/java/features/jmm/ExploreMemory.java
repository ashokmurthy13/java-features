package com.learn.java.features.jmm;

public class ExploreMemory {

    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue);
        System.out.println(localValue);
    }

    public static void calculate(int localValue) { // localValue is a copy by value here
        localValue = localValue * 100;
    }
}
