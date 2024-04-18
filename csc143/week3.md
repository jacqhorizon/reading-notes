# Week 3

## Monday Class

### Shape Project

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/9512e632-83aa-4ea3-b8ba-773aa8be73e7)

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/0290d838-3709-4530-a8a6-b580564899ea)

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/5a492b73-e13c-4102-af83-2cf031360a8b)

* Square extends Rectangle so getColor() will inherit the value of Rectangle
* Oval extends Shape and overrides getColor() with blue
* If we want make an array with Ovals, Squares, etc, we can make an array of Shape
* But we can't use Circle's get methods from the Shape array

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/61a38fa8-ee8e-456b-8f99-5f2371c7b90d)

* **Instanceof** compares objects, `object instanceof type`

## ArrayLists

### ArrayIntList

* **Capacity:** number of elements that can be stored before the data structure has to restructure its internal storage
* **Size:** number of elements currently stored
* Clients are always communicating in size, under the hood we need to track capacity

## Generics

* **Generics:** parameterized types. Allows type to be a parameter
* Add `<>` to indicate you need to pass type
  * `public class IDBox<T> {`
  * `private T contents` T will be replaced with whatever type is instansiated
  * `IdBox<String> box3 = new IdBox<String>(1, "Hello");`
  * `IdBox<String> box4 = new IdBox<Integer>` strong typing prevents this from compiling
* **Erasure:** at runtime generics are converted into something very simple. It turns everything into objects and casts.

<img width="362" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/7192ae1d-3842-4e33-8f93-e1b41be389dd">

* But after `String x = list.get(0);` there is no way to know <T> was <String>, the info is **gone**

### Limitations

* Cannot use primitive types, must use objects or wrappers
* Cannot create new *objects* using type
  * `T foo = new T(); //unexpected type; required: class; found: type parameter T`
  * `T foo =` references (static types) are okay
  * `new T();` are not
* Cannot use instanceof
* Cannot create arrays of parameterized types
  * `Box<Integer>[] myBoxes = new Box<Integer>[2]; //compile time error`
* Some casts generate "unchecked warnings" that need suppressing
  * `foo = (T []) new Object[10];`
  * Add before method declaration: @SuppressWarnings("unchecked")
  * But don't misuse this!!

<img width="537" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/2951e205-4daf-4e3d-bdb2-284a3171febc">

## Wednesday Class

* Client class - try/catch
* Supplier class - exception
* Supplier can only return methods to client class
* No static methods in supplier class
* Use `/** {@inheritDocs }  */` when writing Javadoc for interface overrides
