# 📘 Basic Java Syntax Guide

This guide introduces you to the **basic syntax of Java**, useful for beginners starting their first programs.

---

## 📄 Structure of a Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 🔍 Explanation:
- `public class HelloWorld`: Defines a class named `HelloWorld`
- `public static void main(String[] args)`: Entry point of the program
- `System.out.println(...)`: Prints text to the console

---

## 🔠 Java is Case-Sensitive
- `main` is different from `Main`
- Variable names like `number` and `Number` are different

---

## 🔢 Data Types
| Type    | Description            | Example     |
|---------|------------------------|-------------|
| `int`   | Integer                | `int a = 10;` |
| `double`| Decimal numbers        | `double d = 3.14;` |
| `char`  | Single character       | `char c = 'A';` |
| `boolean`| True or false         | `boolean flag = true;` |
| `String`| Sequence of characters | `String name = "Java";` |

---

## ✏️ Variables and Operators

### Declare and Initialize:
```java
int x = 5;
double y = 3.14;
```

### Operators:
- Arithmetic: `+`, `-`, `*`, `/`, `%`
- Comparison: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Logical: `&&`, `||`, `!`

---

## 🔁 Control Statements

### if-else
```java
if (x > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative");
}
```

### switch
```java
switch (choice) {
    case 1:
        System.out.println("One");
        break;
    default:
        System.out.println("Other");
}
```

---

## 🔄 Loops

### for loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### while loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

## 📥 Input and Output

### Print to console
```java
System.out.println("Hello");
```

### Take input
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int a = input.nextInt();
input.close();
```

---

## 🧹 Comments

```java
// Single-line comment

/*
   Multi-line comment
*/
```

---

## 📌 Summary
- Java programs always start with a `main()` method
- Follow strict syntax and use semicolons `;` to end statements
- Always use curly braces `{}` for blocks of code

---

## 🔗 Useful Links
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [Official Java Docs](https://docs.oracle.com/en/java/)
