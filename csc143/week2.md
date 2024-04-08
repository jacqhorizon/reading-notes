# Week 2

## Java Instance

* **Java instance:** aka objects, represent dynamic entities created from classes, encapsulating both data and behavior
* **Instantiation:** Creating an instance using a class a blueprint. Uses the **new** keyword which executes the class's constructor
* **Class variables:** aka static variables, are shared among all instances of a class
* **Instance variables:** unique to each instance, store state-specific data and allow each instance to maintain its own set of values

## Enumerated Types

* **Enumerated Types:** special data type that enables for a variable to be a set of predefined constants
   * Ex: NORTH, SOUTH, EAST, and WEST
* Move all runtime checking (casing, spacing, spelling, etc) to compile time checking
  * The compiler does all the work for you because the client code won't even compile if one of the specified values is not used
* In UML Diagram use \<\<enum>>
* Might also want to add \<\<static>> to indicate it's internal

<img width="577" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/bfb8b8a7-31e3-49a7-878f-63053ffd7ec5">

* You can still pass null into enum types, so you will still need a precondition for that

### Coding Enum Types in a Class

<img width="534" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/65926c9a-e10b-49b0-9d98-44671eecdf2a">

* Above code is missing precondition for null in setStanding

### Using Enum Types Outside the Containing Class

<img width="479" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/458fdc83-2fff-466c-b3d4-a702e4592a0e">

* At their core, enum types work like integers. So you can compare with =
# Motivation

