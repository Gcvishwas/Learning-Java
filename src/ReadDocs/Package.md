# 📦 Java Package: `Area`

This project demonstrates how to **create and use a custom package** in Java. The package `Area` contains classes to calculate the area of a **rectangle**, **circle**, and **square**.

---

## 🧠 What is a Package in Java?

A **package** in Java is a namespace that organizes classes and interfaces. It helps avoid class name conflicts and makes it easier to maintain and locate related classes.

There are two types:

- **Built-in packages** (e.g., `java.util`, `java.io`)
- **User-defined packages** (like our `Area` package)

---

## 📂 Project Structure

- Area/
    - Circle.java
    - Rectangle.java
    - Square.java
- Main.java
---

## 🛠️ How to Create a Package

1. Create a folder named `Area` (case-sensitive).
2. Inside the folder, create your Java classes.
3. At the top of each class file inside the package, write:

```java
package Area;
```
## Example

```java
package Area;

public class Rectangle {
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}
```
## 📥 How to Use the Package in Another Class

- **Use import statements**
- **Syntax**
```
  import PackageName.Function
  import Area.Rectangle;
  import Area.Circle;
  import Area.Square;
  ```

# Now you can use the functions in your file as you would do for any other program

---

## 📋 Summary: Steps to Create and Use a Java Package

1. **Create a folder** with the package name (e.g., `Area`).

2. **Add Java classes** inside that folder.

3. **Declare the package** at the top of each class file:
   ```java
   package Area;
