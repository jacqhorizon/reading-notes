# Week 5

## Linked Lists

* Analogy: Class roster where each student points to the next student
  * The last student points at the ground (null) because there is no next student
  * If one students in the middle stops pointing (they got tired), the rest of the students are garbage collected!
  * How do we add a student in the middle?
  * How do we remove a student from the middle?
* **Node:** each element in a linked list, identical in data type.
* Typically have two parts:
  * **Data part:** the data
  * **Reference part:** the "next"
  * Both data and next are public for easier navigation
  * Client code is gonna pass us data, not nodes
* The list maintains a reference that points to the first element, our gateway to the nodes. Commonly names: list, front, head
* All nodes are kept in memory because they are currently being referenced
* **Traverse:** moving through the list

### Linked List Example

<img width="640" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/93e3fa34-744a-46ab-bf5f-ae8ced0d0b88">

- `front.lastName` will get the first student's name "Alarcon"
- `front.next.lastName` will get the second student's name "Barajas"
- `front.next.next.lastName` will get the third student's name "Chavez"
- `front.next.next.next` is okay BUT adding `.lastName` will get null pointer exception
  - Dot before last name is attempting to dereference (follow and use) a null pointer

### Linked List Testing

* List might be empty (front reference is null)
* Consider where nodes are in the list - beginning, middle, end

## Linked List Algorithms

Keep in mind:

* Two approaches to maintaining size:
  * Traverse each time you are asked for size (good to practice)
  * Create and maintain a size instance variable (more efficient)
* Reduce code redundancy
  * Many methods require similar traversals
* Keep traversals to a minimum in helper methods
* Helper methods can return *references* rather than *positions*

### Adding Nodes to the front 

<img width="539" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/c26610ee-0e6f-40ef-9699-d3ab0b0ca949">

<img width="534" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/56dd1d81-18a8-4aed-a005-8e4af7f0eab1">

* Think about the = as pointing to

### Counting Nodes

<img width="541" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/4fa7ef29-bef3-4655-860f-95d2a2e7e476">

* This code *follows* the final student's reference to null, but it doesn't *dereference* it

### Remove Nodes

<img width="539" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/5fbdace6-baf1-46ab-8336-4c4cdcef2c7a">

### Add in Order

<img width="348" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/024a4c0a-978a-4d85-83c0-1916e79c2d83">

```java
newNode.next = current.next;
current.next = newNode;
```

### Clear the list

```java
front = null;
// garbage collector go!
```

### Combine lists

<img width="357" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/a26768ed-e364-4388-9864-18146b51166e">

* Point last studentnode reference to the first one in the other list

### Linked List Helper Methods

Two useful building-block helper methods

* `public int indexOf(int value)`
* `public ListNode nodeAt(int index)`

We may also find that two or three ListNode constructors may be helpful

* `public ListNode(int data, ListNode next)`
* `public ListNode(int data)`
* `public ListNode( )`

## Dummy Nodes

* Front isn't a node, its a reference to a node
* Our code is very frequently special casing front - "if front is null, then point front to the new node"
* **Dummy node:** simplifies code by eliminating the special case

<img width="322" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/4de8ef5c-1430-44fc-a052-46f40882287f">

* Point front at this dummy node with no data, so we can simply start with `front.next`

<img width="533" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/2959329f-c130-4077-92c1-fb110946ddbf">
