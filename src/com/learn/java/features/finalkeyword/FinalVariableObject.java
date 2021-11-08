package com.learn.java.features.finalkeyword;

public class FinalVariableObject {

    /**
     * If a final variable holds a reference to an object, then the state of the object may be changed by operations on the object,
     * but the variable will always refer to the same object.
     */
    public static void main(String[] args) {
        final Customer customer = new Customer("Final");
        System.out.println(customer.getName());
        //customer = new Customer("Ashok Murthy"); cannot re-assign the customer object to new memory
        customer.setName("Final Modified"); // but the data on the object can be changed
        System.out.println(customer.getName());
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
