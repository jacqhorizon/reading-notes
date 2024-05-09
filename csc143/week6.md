# Week 6

## Recursion

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
### Factorial

* Formula: 5! = 5 * 4 * 3 * 2 * 1
* n! = n(n-1)!
* Start with base case
  * 0! = 1
  * 1! = 1
* Then write recursive case
* n! = n(n-1)! if n>1
  
    = 1 if n=0, 1

### Reversing a list

```java
public static void reverse(Scanner input) {
 if(input.hasNextLine()) { // base case
  String line = input.nextLine(); // base case
  reverse(input) // recursive case
  System.out.print(line); // Once we go through the stack, we can print all the lines
 }
}
```

* The stack is LIFO!!

### Duplicating numbers

```java
public static int stutter(int n) {
    if (n < 10) {
        return n * 11;
    } else {
        int a = stutter(n /10); // this stack must finish before going to next line
        int b = stutter(n % 10);
        return a * 100 + b;
    }
}
```
![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/3d24d0a7-6f3c-4bb2-8be0-603e15c22942)

## Trees

* **Tree:** a directed, acyclic structure of linked nodes
 * **Directed:** has one-way links between nodes
 * **Acyclic:** No path wraps back around to the same node twice
 * **Binary tree:** Tree where each node has at most two children
* A tree can be defined as either:
 * empty(null) or
 * a root node that contains:
  * data
  * a left subtree
  * and a right subtree
  * (either of which can be empty)
* **Node:** an object containing a data value and left/right children
* **Root:** topmost node of a tree
* **Leaf:** a node that has no children
* **Branch:** any internal node; neither the root nor a leaf
* **Parent:** a node that refers to this one
* **Child** a node that this node refers to
* **Sibling:** a node with a common

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/192b2681-4d46-472b-b8c1-55344ff71ce8)

* For binary *search* trees: keep lesser number data to the left of it's parent

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/e49cc13f-14ad-446e-afed-e4cff40d07d0)

* We are a boat going around the islands
* **Preorder:** Start at root, then go left; don't have left? Go right

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/2a9620db-6a80-486c-82c6-67aaa857711e)

* **Inorder:** Start at left, then root, then right

 ![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/4d145322-8e83-4c18-99fe-a0f6e2a87f43)

* **Postorder:** Left, right, root

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/3286727e-5931-4523-a575-1bccbd6c77dc)

## Wednesday Class

* `public class LinkedList<E extends Comparable<E>> {`
* T is type, E is element

```java
public static void toBinary(int n) {
 if(n <2) {
  System.out.print(n);
 } else {
  System.out.print(n%2);
 }
}
```

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/d12d7610-981b-4d81-a68c-ea87ce3613ee)

### Binary Tree

* client will never get access to node class

![image](https://github.com/jacqhorizon/reading-notes/assets/97759961/2b23f81c-0d2c-4e47-94e1-88828d465bff)

Tree Traversal

* recursive statements

```
private preOrder(IntTreeNode root) {
 sop(root.data);
 preOrder(root.left);
 preOrder(root.right);
}
```

```
private inOrder(IntTreeNode root) {
 if (root != null)
 preOrder(root.left);
 sop(root.data);
 preOrder(root.right);
}
```

Create 2 overloaded methods - one public, one private

Public:

```
public void preOrder() {
 sop("preorder!");
 preorder(overAllRoot);
```

Private:

```
private void preOrder(IntTreeNode root) {
```

* Overload: having two or more methods (or functions) in a class with the same name and different arguments (or parameters)
