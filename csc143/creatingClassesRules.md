# Rules For Creating New Classes 

| **Supplier class** | **Client class** |
| --- | --- |
| not an executable code | must have main() method |
| all non-static methods, except for test method | all static methods |
| no print statements, just return statements | can use print statements |
| throw exceptions if preconditions are not met | use try... catch for exceptions |

## These rules are related only to the supplier classes

### Instance Variables

\- must be private  
\- don't assign any value  
\- the number of instance variables must match the number of parameters in the full constructor  

### Constants

\- declared as public final  
\- must be assigned a value  
\- the name should have the format CONSTANT_NAME 

### Constructors  

\- no return type in a header  
\- same name as class name  
\- partial constructors must call a full constructor and pass all parameters  
\- the full constructor calls to set methods  
\- if a parameter does not have a set method, it must be validated in the constructor  

### Accessors 

\- generally, the method name should begin with "get"  
\- returns the value of an instance variable  
\- no parameters  
\- generally, one for every instance variable  

### Mutators  

\- method name should begin with "set"  
\- void method  
\- generally, one to set every instance variable  
\- must validate parameters and throw an IllegalArgumentException if they are not valid  

### toString() method  

\- method header: public String toString()  
\- returns a nicely formatted string representation of the object  
\- overwrites the toString() method inherited from the parent class Object, because it has the same signature (overridden method)

## Other methods

- may be private or public; private methods cannot be accessible from the client class
