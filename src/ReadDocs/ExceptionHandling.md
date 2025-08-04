# Java Exceptions

## 📌 What is an Exception?

In Java, an **exception** is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime when an error occurs.

Java provides a powerful mechanism for handling runtime errors, so the program can continue running without crashing.

---

## ⚙️ Types of Exceptions

Java exceptions are mainly classified into two types:

1. **Checked Exceptions**
    - Occur at compile-time.
    - Must be handled using try-catch or declared using `throws`.
    - Example: `IOException`, `SQLException`

2. **Unchecked Exceptions**
    - Occur at runtime.
    - Not checked by the compiler.
    - Example: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`

---

## 🛠 Common Exception Classes

| Exception                  | Description |
|---------------------------|-------------|
| `ArithmeticException`     | Dividing by zero |
| `NullPointerException`    | Accessing members of a null object |
| `ArrayIndexOutOfBoundsException` | Accessing invalid array index |
| `NumberFormatException`   | Invalid conversion of string to number |
| `IOException`             | Input-output related error |

---

## 🔐 Exception Handling Keywords

- **`try`**: Defines the block of code to test for errors.
- **`catch`**: Defines the block of code to handle the error.
- **`finally`**: Block that always executes, regardless of exception.
- **`throw`**: Used to explicitly throw an exception.
- **`throws`**: Declares exceptions in the method signature.

---

## ✅ Example: Exception handling with unchecked and checked exceptions

```java
import java.io.*;

public class ExceptionExample {

    public static void main(String[] args) {
        // Unchecked Exception Example
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }

        // Checked Exception Example
        try {
            readFile("test.txt"); // This may cause FileNotFoundException
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }
    }

    // Method that throws a checked exception
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // Checked Exception
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }
}
