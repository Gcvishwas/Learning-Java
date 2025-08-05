
# 📄 File Handling in Java

File handling in Java is used to create, read, write, and update files stored on the file system. It is part of the `java.io` package.

---

## ✍️ Writing to a File

You can write to a file using `FileWriter` and `BufferedWriter`.

### Example: Writing Employee Details to `Emp.txt`
```java
import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter DOB: ");
        String dob = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("Emp.txt"));
        writer.write("ID: " + id);
        writer.newLine();
        writer.write("Name: " + name);
        writer.newLine();
        writer.write("Address: " + address);
        writer.newLine();
        writer.write("DOB: " + dob);
        writer.newLine();
        writer.write("Phone: " + phone);
        writer.close();

        System.out.println("Employee data written to Emp.txt");
    }
}
```

---

## 📖 Reading from a File

You can read files using `FileReader` and `BufferedReader`.

### Example: Reading `Emp.txt`
```java
import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Emp.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
```

---

## ❓ Why use `BufferedWriter` or `BufferedReader`?

- **Efficient**: It reduces the number of I/O operations by using a buffer.
- **Convenient**: Includes utility methods like `newLine()`.
- **Performance**: Better for writing/reading multiple lines or large files.

---

## 📁 Where is the File Created?

- If you use just the filename (e.g., `"Emp.txt"`), the file is created in the **project root directory** (not inside `src`).
- You can also specify a relative or absolute path: `"data/Emp.txt"`

> Make sure the directory exists before writing to it.

---

## ✅ Best Practices

- Always **close the file** after use to prevent memory leaks.
- Use `try-with-resources` to automatically close streams.
- Handle exceptions with `try-catch` blocks.

---

Happy Coding! 💻
