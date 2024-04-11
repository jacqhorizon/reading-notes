# Week 1

## Testing

### Types of Tests

* **Unit Tests:** Testing in the small
  * Test one method or class
  * Make sure unit is responding correctly in "happy path" expected cases
  * Make sure unit is failing in expected ways when things go wrong
  * Written by coders and submitted along with production code
* **Integration and System Tests:** Testing in the large
  * Test the software with units working together holistically

* When testing floating points, use delta

```java
assertEquals(120.0, testStudent.getPrice(), 0.00001);
```
