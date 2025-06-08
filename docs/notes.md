 # Object-Oriented Programming (OOP) Theory in Java

This document summarizes the core OOP concepts practiced through exercises in this repository: Encapsulation, Inheritance, Polymorphism, and Abstraction. These principles are fundamental to designing modular, reusable, and maintainable code in Java.

## 1. Encapsulation

### What is Encapsulation?
Encapsulation is the OOP principle of bundling data (attributes or fields) and the methods that operate on that data within a single unit, typically a class, while restricting direct access to the data from outside the class. It protects the internal state of an object and ensures that data is accessed or modified only through controlled methods.

### Key Features in Java:
- **Private Fields**: Class fields are declared `private` to prevent direct access from outside the class.
- **Getters and Setters**: Public methods (`getX()` and `setX()`) provide controlled access to read or modify private fields.
- **Data Protection**: Encapsulation helps maintain data integrity by allowing validation logic in setters (e.g., preventing negative values for age).

### Why Use Encapsulation?
- Hides implementation details, reducing the risk of unintended modifications.
- Increases security by controlling how data is accessed or changed.
- Makes code easier to maintain since internal changes don’t affect external code as long as the public interface (getters/setters) remains consistent.

### Example in This Repository:
- **Class**: `Person` (`src/main/java/oop/Person.java`)
- **Implementation**: The `Person` class has `private` fields `name` (String) and `age` (int). Access to these fields is provided via public getters (`getName()`, `getAge()`) and setters (`setName()`, `setAge()`). A separate class `PersonExample` demonstrates creating a `Person` object, updating values, and printing them.
- **Key Takeaway**: Direct access to `name` and `age` is prevented; interaction happens only through defined methods, ensuring encapsulation.

### Practical Benefits Observed:
- If validation (e.g., no negative age) is added to `setAge()`, external code doesn’t need to change, showcasing how encapsulation isolates internal logic.

## 2. Inheritance & Polymorphism

### What is Inheritance?
Inheritance is an OOP mechanism that allows a class (subclass or child class) to inherit attributes and methods from another class (superclass or parent class). It promotes code reuse and establishes a hierarchical relationship between classes.

### Key Features in Java:
- **extends Keyword**: Used to define inheritance (e.g., `class Dog extends Animal`).
- **Access to Superclass Members**: Subclasses inherit non-private fields and methods from the superclass.
- **Method Overriding**: Subclasses can provide specific implementations of inherited methods using the `@Override` annotation.
- **Hierarchical Structure**: Represents "is-a" relationships (e.g., a `Dog` is-an `Animal`).

### What is Polymorphism?
Polymorphism, often tied to inheritance, allows objects to be treated as instances of their superclass while invoking the specific behavior defined in their subclass. It means "many forms" and enables a single interface to represent different underlying forms (types).

### Types of Polymorphism in Java:
- **Compile-Time (Static) Polymorphism**: Achieved through method overloading (same method name, different parameters).
- **Runtime (Dynamic) Polymorphism**: Achieved through method overriding, where the method to call is determined at runtime based on the object’s actual type, not the reference type.

### Why Use Inheritance & Polymorphism?
- **Code Reuse**: Common behavior defined in a superclass can be reused by multiple subclasses.
- **Extensibility**: New subclasses can be added without modifying existing code.
- **Flexibility**: Polymorphism allows writing generic code that works with any subclass type through a superclass reference.

### Example in This Repository:
- **Classes**: `Animal`, `Dog`, `Cat` (`src/main/java/oop/Animal.java`, `Dog.java`, `Cat.java`)
- **Implementation**: `Animal` is a superclass with a method `makeSound()` that prints a generic sound. `Dog` and `Cat` extend `Animal` and override `makeSound()` to print "Bark" and "Meow," respectively. The `AnimalHierarchy` class demonstrates runtime polymorphism by referencing `Dog` and `Cat` objects as `Animal` type and calling `makeSound()`, which invokes the overridden methods.
- **Key Takeaway**: Inheritance allows `Dog` and `Cat` to reuse the structure of `Animal`, while polymorphism ensures the correct `makeSound()` behavior is called based on the actual object type at runtime.

### Practical Benefits Observed:
- Adding a new animal (e.g., `Lion`) requires only creating a new subclass with its own `makeSound()`, without changing existing code.
- Code in `AnimalHierarchy` is generic and works with any `Animal` subtype, demonstrating the power of polymorphism.

## 3. Abstraction

### What is Abstraction?
Abstraction is the OOP principle of hiding complex implementation details and exposing only the essential features of an object. It focuses on "what" an object does rather than "how" it does it, simplifying interaction with the object.

### Key Features in Java:
- **Abstract Classes**: Classes declared with `abstract` keyword cannot be instantiated and may contain abstract (unimplemented) and concrete (implemented) methods. Subclasses must implement abstract methods.
- **Interfaces**: Purely abstract constructs (prior to Java 8) defining a contract of methods that implementing classes must provide. Interfaces use the `implements` keyword.
- **Hiding Details**: Users interact with high-level methods without needing to know internal logic.

### Why Use Abstraction?
- Simplifies code by reducing complexity for the end user.
- Enforces a contract, ensuring implementing classes provide specific functionality.
- Allows flexibility to change internal implementations without affecting external code.

### Example in This Repository:
- **Interface and Classes**: `Shape`, `Circle`, `Rectangle` (`src/main/java/oop/Shape.java`, `Circle.java`, `Rectangle.java`)
- **Implementation**: `Shape` is an interface with a method `calculateArea()` that returns a `double`. `Circle` implements `Shape` and calculates area as π * radius², while `Rectangle` implements `Shape` and calculates area as length * width. The `ShapeDemo` class creates instances of `Circle` and `Rectangle` as `Shape` type and calls `calculateArea()`, demonstrating abstraction.
- **Key Takeaway**: The `Shape` interface abstracts the concept of area calculation, hiding how each shape computes it. Users only need to call `calculateArea()` without worrying about the formula.

### Practical Benefits Observed:
- Adding a new shape (e.g., `Triangle`) only requires implementing the `Shape` interface with its own `calculateArea()`, without modifying existing code like `ShapeDemo`.
- Abstraction ensures that all shapes adhere to the same contract (`calculateArea()`), making the system consistent and extensible.

## Summary of OOP Principles
- **Encapsulation**: Protects data by restricting access and using getters/setters (`Person` example).
- **Inheritance**: Enables code reuse through a superclass-subclass hierarchy (`Animal/Dog/Cat` example).
- **Polymorphism**: Allows dynamic behavior based on object type, often with inheritance (`Animal.makeSound()` overridden in `Dog` and `Cat`).
- **Abstraction**: Hides implementation details, exposing only necessary functionality (`Shape` interface with `Circle` and `Rectangle`).

## How These Concepts Work Together
In real-world Java applications, these OOP principles combine to create robust systems:
- A class might use **encapsulation** to protect its data, **inherit** from a base class for shared behavior, exhibit **polymorphism** by overriding methods, and implement an **interface** to adhere to a contract.
- Example: A `Vehicle` system might have an abstract `Vehicle` class or interface, with `Car` and `Truck` as subclasses, each encapsulating specific data (e.g., fuel level) and providing polymorphic behavior (e.g., different `drive()` implementations).

## Exercises in This Repository
- **Encapsulation**: `Person` and `PersonExample` demonstrate private fields with public getters/setters.
- **Inheritance & Polymorphism**: `Animal`, `Dog`, `Cat`, and `AnimalHierarchy` show superclass-subclass relationships and runtime polymorphism.
- **Abstraction**: `Shape`, `Circle`, `Rectangle`, and `ShapeDemo` use an interface to abstract area calculation logic.

These exercises reinforce how OOP principles translate to practical Java code, building a foundation for more complex topics like design patterns and frameworks.

## Further Reading
- Oracle Java Tutorials on OOP: [https://docs.oracle.com/javase/tutorial/java/concepts/](https://docs.oracle.com/javase/tutorial/java/concepts/)
- Java Documentation on Interfaces and Inheritance: [https://docs.oracle.com/javase/specs/](https://docs.oracle.com/javase/specs/)