# ⚙️ Java Setup Guide for Beginners

This guide will help you set up Java on your system so you can compile and run Java programs easily.

---

## 🖥️ Step 1: Install Java JDK

### 🔗 Download JDK
- Go to the official Oracle JDK page:  
  👉 https://www.oracle.com/java/technologies/javase-downloads.html

### 📦 Choose the latest stable version

### ✅ Install
- Download the installer for your OS (Windows/Mac/Linux) and follow the steps.

---

## 🧪 Step 2: Verify Installation

### Open your terminal or command prompt and type:
```bash
java -version
javac -version
```

✅ You should see output like:
```
java version "24.0.2"
javac 24.0.2
```

If not, make sure the Java bin folder is added to your system PATH.

---

## 📁 Step 3: Set Environment Variables (Windows)

1. Open **Start Menu** → search for **Environment Variables**
2. Click **Environment Variables** at the bottom
3. Under **System Variables**:
    - Click **New**
        - Name: `JAVA_HOME`
        - Value: `C:\Program Files\Java\jdk-24` (path to your JDK)
    - Select **Path** → **Edit** → **New** → Add:
      ```
      %JAVA_HOME%\bin
      ```

4. Click OK and Restart your terminal

---

## 🧪 Step 4: Compile and Run a Java Program

### 1. Create a file: `HelloWorld.java`
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 2. Open terminal or command prompt in that folder and run:
```bash
javac HelloWorld.java
java HelloWorld
```

✅ Output:
```
Hello, World!
```

---

## 💡 Optional: Install an IDE

You can write Java code in any text editor, but using an IDE will make it easier.

### Recommended IDEs:
- **IntelliJ IDEA**: https://www.jetbrains.com/idea/
- **Eclipse**: https://www.eclipse.org/
- **VS Code (with Java extensions)**: https://code.visualstudio.com/

---

## 🚀 You're Ready!
You now have Java installed and can start coding your assignments and projects.

---

## 📎 Quick Checklist

| Task                    | Done |
|-------------------------|------|
| Install JDK             | ✅    |
| Add to PATH             | ✅    |
| Test `java` and `javac` | ✅    |
| Compile & Run Program   | ✅    |

Happy Coding! 💻✨
