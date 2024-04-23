# Week 4

## Monday Class

* Avoid duplicating code

```java
private void stringValid(String param) {
  if(param == null || param.isEmpty()) {
    throw new IllegalArgumentException("The " + param + " should not be null or empty");
  }
}
```

* Never use `this.variableName` in the constructor, use setters like `setVariableName("example")`
* Use default parameters for partial instructors, not "empty" or null
