# Week 7

*  Static method does not have access to variables from the outter method
*  Node can use this.data and this.next because they are objects
  * E (generic) will always be an object
* We use extends (instead of implements) Comparable because not every object will have compareTo
  * `public class LinkedList<E extends Comparable<E>>`
* **Primitive data types:** predefined
  * Not composed of other data types, like an atom
  * Doesn't have any methods
  * Small amount of memory - all primitives of same type have same size, ex: int always 32 bits
* **Object data types:** user-defined, like a molecule
  * Inherits methods from its class
 
```java
String s1 = "Text";
String s2 = "Text";
```

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/e8dce062-dd54-454e-a378-83d48489e247)

* Assignment statement will use same memory
* new String() will point to new address in memory
* Java doesn't remember where s1 is, it just remembers what it points to
