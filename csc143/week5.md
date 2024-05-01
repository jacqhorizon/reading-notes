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
* 
