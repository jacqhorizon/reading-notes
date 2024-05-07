# Week 6

* **Recursion:** the definition of an operation in terms of itself
  * Solving a problem using recursion depends on solving smaller occurrences of the same problem
  * Not always best option because of time complexity and memory, can cause stack overflow
  * Stack: list of all method calls
  * Standard size of a stack is 1MB
* Analogy: You are standing in a line and want to know how many people are in front of you.

* Every algorithm involves at least 2 cases
* **Base case:** simple occurence that can be answered directly
* **Recursive case:** a more complex ocurrence of the problem that cannot be directly answered, but can instead be described in terms of smaller occurrences of the same problem
```java
public static void drawStars(int n) {
  if(n<0) throw new IllegalArgumentException(" ");
  else if(n == 0) { // base case
    System.out.println();
  } else { // recusive case
    System.out.println("*");
    drawStars(n - 1); // each one of these will get stored in the stack until we hit n == 0
  }
}
```
# Factorial

* Formula: 5! = 5 * 4 * 3 * 2 * 1
* n! = n(n-1)!
* Start with base case
  * 0! = 1
  * 1! = 1
* Then write recursive case
* n! = n(n-1)! if n>1
  
    = 1 if n=0, 1

  
  
