# Week 7

## Wednesday Notes

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

```java
// This will not swap
public static void swapPoints(Point x, Point y) {
 Point temp = x;
 x = y;
 y = temp;
}

// This will swap
public static Point swap(Point p) {
 Point p1 = new Point();
 p1.setLocation(p.getY(), p.getX());
 return p1;
}
```

## Big O

* **Time** and **Space** (choosing the correct data structure)
* Measures the efficiency of your algorithm
* Big O describes the upper bound

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/1e8be452-55b1-4157-98c4-81462c04c62a)

* Bubble Sort
 * worst case: we have to swap all numbers - O(n^2)
