## final keyword

### **final variable** - used to create constants

* final variable cannot be modified. It's a Constant

        final int number = 10;
        final String name = "Java"; 
* final variable which contains object reference cannot be re-assigned, but the state of the object can be modified. Meaning content of the object can be modified.

        final Customer cust = new Customer("Final");
        cust = new Customer("New Final"); // this will throw a complier error
        cust.setName("Final Modified"); // this is possible, the state of the object can be modified

### **final method** - used to prevent method overriding
* final methods cannot be overridden by any subclass

       final public double calculate(double a, double b) {
          // code
       }

### **final class** - used to prevent inheritance
* final class cannot be inherited or extended by other classes

        final class Customer {
          // code
        }