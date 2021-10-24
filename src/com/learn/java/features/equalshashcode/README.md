## equals() and hashCode()
* equals() method is used to compare all the values in the object are equal
  * for e.g. name, number, origin, destination in Flight class


* if equals method is not implemented for the above fields, then the default implementation is used, where it will not check all the user defined object fields, it just checks the object references(both objects memory address are same or not).


* by default, all the wrapper class in Java are implemented with equals and hashcode methods


* hashCode must be implemented whenever equals method is implemented, failing to do, will not function properly with hash based collections like HashMap, HashSet, Hashtable


* only equals method is enough to check whether the objects are same or not. but as mentioned above, to work properly with hash based collections like HashMap, HashSet hashcode() method must be implemented.


* if hashcode() is not implemented, then the default hashcode implementation is used(calculate hash using memory address), which will result in wrong results.
