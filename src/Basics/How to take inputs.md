# 🧾 How to Take User Input in Java

In Java, user input is most commonly taken using the `Scanner` class, which is part of the `java.util` package.

---

## ✅ Step-by-Step Guide

### 1. **Import Scanner Class**
```java
import java.util.Scanner;
```

### 2. **Create Scanner Object**
```java
Scanner input = new Scanner(System.in);
```

### 3. **Use Scanner Methods to Read Input**
- `nextInt()` – for integers
- `nextDouble()` – for decimals
- `nextLine()` – for full lines (strings)
- `next()` – for single-word input
- `nextBoolean()` – for boolean values (`true` or `false`)

---

## 💡 Example Program

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // String input (single word)
        System.out.print("Enter your first name: ");
        String name = scanner.next();

        // Full line input (clear buffer first)
        scanner.nextLine(); // clear newline left by next()
        System.out.print("Enter your full address: ");
        String address = scanner.nextLine();

        // Display
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Address: " + address);
        
        scanner.close();
    }
}
```

---

## 📘 Notes
- Always call `input.nextLine()` **after** reading numeric input (`nextInt()` or `nextDouble()`) to consume the leftover newline.
- Don’t forget to **close** your `Scanner` object using `scanner.close();` when done (especially in larger applications).

---

## 🔗 References
- [Java User Input (W3Schools)](https://www.w3schools.com/java/java_user_input.asp)
- [Oracle Java Scanner Docs](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
