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

## Inheritance and Overrides

* **Has A Relationship:** Our BakeShop object *has a* BakeryOrder
  * Implies one class has a reference to an instance of another class
* **Is A Relationship:** A truck *is a* vehicle
  * Form classification hierarchies
  * Ex: a CD *is a* savings account which itself *is a* bank account
* **Subclass:** aka derived class, inherits behaviors from its parent, plus access to public data
* **Superclass:** aka base class, the parent
* **"Extend the class:""** Creating a subclass
  * `public class Student extends Person`
  * The subclass constructor always starts with keyword *super*
* **Inheritance:** "Does this class have this method? If no, walk up the chain until you find it"
  * Superclass can keep fields private from subclasses, you need to use the method
* **Override:** Ex: the subclass can have it's own toString even if your superclass has a toString
  * This will be an overridden method

## Polymorphism and Abstracts

* **Polymorphism:** You are going to get the right type, regardless of what kind of reference.
  * Ex: `Person testPerson = new Student("name", "email");` will use the overriden toString method of Student
  * Student treated as a Student
  * BUT you cannot call methods specific to the subclass, because the Person reference does not know about those methods
  * You *could* cast to fix this `((Student)testPerson).recordCourseCompletion("Sociology", 4.0);` but you probably *should not* do this
* You can put different subtypes into an array
* **Abstract class:** a class that cannot be instantiated
  * `abstract public static Person` will make Person abstract because you only want to instanstiate its subclasses, Student, Teacher, etc
  * Student, Teacher, etc are **concrete** classes
* **Abstract method:** method you must implement in subclasses
  * Declare in superclass without a body
  * Implement in subclass
  * Any subclass without the method will not compile

<img width="345" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/39fbb795-98d1-4f09-b1a1-fe56b42ec40f">

* In a subclass, you can call a superclass method

<img width="295" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/8fe19176-0b08-4b1d-b08c-9a642985eb63">

## Interfaces

* **Interfaces:** Contractual behaviors that classes must implement
  * Classes can implement one or more Interfaces
  * With inheritance, classes can only have one parent
  * Interface is a contract that says "if you do these things, I can make magic happen"
 
<img width="498" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/eafdee5f-9c91-475b-9811-9eb232feaa48">

  * `abstract public class Person implements ISavable` will compile without actually implementing the Interface methods because it's abstract
  * The subclasses will compile if the parent has actually implemented the Interface methods

## Monday Class Notes

### Class Diagram

* Include Interface in Class Diagram
* Don't repeat the methods from the interface in the other classes
* Two methods: readCities and readCountries
* Full constructor call set methods with validations for all variables
* Partial constructor will call full constructor using keyword this
  * Pass null for state
* Put comparableInterface in diagram and use compareTo()
* Client class will create a new cityManager class

### File Set Up

* LastName_HW01
* Copy CityInterface to source folder

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/ebc384b5-6ae3-4185-b20f-b45f6eaa5667)

### Happy Path Testing

* **assertEquals**
* **assertThrows**

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/0d118354-9c76-43fe-8d72-2240721dd970)

### Jagged Arrays

* If you don't need the index, for example just printing, you can use for each loop

### Comparable Interface

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/ff982396-f63d-4253-887a-53366c618de7)

* For strings, it compares the Ascii values
* `San Francisco > San Diego` returns 2 because D - F = 2, therefore San Diego will go before San Francisco
* Multiples interfaces `implement Comparable<City>, implement ...` separate with a comma
* Adding `@Override` will make the compiler check the method signature

| `Parent p = new Child( );` | `Child c = new Parent( );` | `Child c = ( Child ) new Parent( );` |
|-----------------------------|----------------------------|--------------------------------------|
| <- upcasting | incompatible type | Downcasting but throws ClassCastException at runtime - Child could have more methods than parent, thereore you cannot downcast it |





