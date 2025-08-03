# 🧱 Object-Oriented Programming (OOP) in Java

Java is an object-oriented programming language that supports key OOP principles like **classes**, **objects**,**abstraction**, **encapsulation**, **inheritance**, and **polymorphism**.

---

## 🌟 1. Class and Object

A **class** is a blueprint. An **object** is an instance of a class.

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // object created
        myCar.brand = "Toyota";
        myCar.drive();
    }
}
```

---

## 🚀 2. Constructor

A **constructor** is a special method used to initialize objects.

```java
class Student {
    String name;

    Student(String n) {    // constructor
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Regi");
        s1.display();
    }
}
```

**Note:** If no constructor is defined, Java provides a default constructor.

---

## 🔐 3. Encapsulation

Hiding internal details by using private variables and providing access via public methods.

```java
class BankAccount {
    private double balance; //cannot be accessed outside the class

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 🧬 4. Inheritance

Allows a class (subclass) to inherit properties of another class (superclass).

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // inherited
        d.bark();   // own method
    }
}
```

---

## 🧰 5. `super` Keyword

`super` is used to refer to the immediate parent class.

### Example 1: Access parent class method
```java
class Animal {
    void sound() {
        System.out.println("Generic sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // calls parent method
        System.out.println("Dog barks");
    }
}
```

### Example 2: Access parent constructor
```java
class Person {
    Person(String name) {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);  // calls Person constructor
    }
}
```

---

## 🎭 6. Polymorphism

Same method name behaves differently based on context.

### Compile-time (Method Overloading)
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### Runtime (Method Overriding)
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

## 📦 7. Abstraction

Hiding implementation using abstract classes or interfaces.

### Abstract Class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

---

## 📘 Quick Summary

| Concept       | Purpose                            |
|---------------|-------------------------------------|
| Class/Object  | Blueprint / Instance                |
| Constructor   | Initialize objects                  |
| Inheritance   | Reuse code                          |
| Encapsulation | Hide data using private + getters   |
| Polymorphism  | Many forms (overload / override)    |
| Abstraction   | Show essential, hide details        |
| `super`       | Access parent class methods/constructor |

---

## 🛠️ Try It Yourself

Create your own class like `Book`, `Employee`, or `Vehicle` and implement:
- Constructor
- Getter/Setter
- Inheritance
- Method Overriding

---

## 📚 References
- [Java OOP – W3Schools](https://www.w3schools.com/java/java_oop.asp)
- [Java Inheritance – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
