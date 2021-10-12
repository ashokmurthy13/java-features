
### Comparable
Comparable interface is used to sort based on one or multiple fields. This has to be implemented in the class itself.

In the example, **Flight** class implements the Comparable interface and overrides the **compareTo(Flight flight)** method. The compareTo method can compare single field or multiple fields. This implementation is stick to the Flight class. When we call Collections.sort() method, the sorting is done based on the implementation provided in the compareTo method in Flight class.

### Comparator
The functional interface Comparator is used to sort based on multiple fields outside the class. This interface is used to sort the objects outside the class. If we need to sort based on different fields, then we can use **Comparator** interface and override the **compare(Flight f1, Flight f2)** method.

#### When to use
 If the class(lets say **Flight**) is from 3rd party package, and it's already implemented with Comparable interface based on a field(let's say flight **number**). If we need to sort based on different field(lets say **origin**), then we need to use Comparator interface and override the compare() method, since the Flight class cannot be modified.