package com.learn.java.features.finalkeyword;

public class FinalVariable {

    private static final String name = "Java";

    public static void main(String[] args) {
        // name = "Java 8"; // cannot assign value to a final variable
        System.out.println(name);
    }
}
