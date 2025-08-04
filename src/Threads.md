# 🧵 Multithreading in Java

Multithreading allows Java programs to perform multiple tasks simultaneously. Each thread runs independently and shares the same memory space.

---

## 🧠 What is a Thread?

A **thread** is a lightweight subprocess, the smallest unit of processing. In Java, threads can be created in two ways:

1. By **implementing Runnable** interface
2. By **extending Thread** class

---

## ✅ Example 1: Implementing Runnable

```java
class ThreadA implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadA());
        t.start();  // starts the thread
    }
}
```

---

## ✅ Example 2: Extending Thread

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

📝 Outputs in thread may be interleaved due to concurrent execution.

---

## ⚙️ Thread Methods

| Method      | Description                       |
| ----------- | --------------------------------- |
| `start()`   | Starts a new thread               |
| `run()`     | Contains code to be executed      |
| `sleep(ms)` | Suspends execution                |
| `join()`    | Waits for a thread to finish      |
| `isAlive()` | Checks if thread is still running |

---

## 🕹️ Thread Lifecycle

1. **New** → thread object created
2. **Runnable** → `start()` is called
3. **Running** → thread is being executed
4. **Waiting/Sleeping/Blocked**
5. **Terminated** → completed or stopped

---

## 🛡️ Synchronization

Multiple threads accessing shared resources may lead to inconsistency. Use `synchronized` block/method to avoid this.

## 🧾 Real-Life Example

Imagine you and your friend are writing on the **same whiteboard** at the same time.

- You both want to write `count = count + 1`
- But because you write at the same time, the value gets **messed up**
- Maybe it skips a number or writes the wrong result

💥 This is what happens when two threads try to change the same value at the same time.

---

## ✅ `synchronized` Fixes It!

When we use `synchronized`, it’s like saying:

> 🛑 **"Wait your turn! Only one person (thread) can change the whiteboard (data) at a time."**

---

## 💻 Java Code Example

```java
class Counter {
    int count = 0;

    // This method is synchronized — only one thread can use it at a time
    public synchronized void increment() {
        count++;  // same as count = count + 1
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that both increment the counter 1000 times
       //  ()-> is a lamda expression
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait until both threads are finished
        t1.join();
        t2.join();

        // Print the result
        System.out.println("Final count: " + counter.count);
    }
}

```

## 🧪 Try It Yourself

- Create threads to count numbers
- Add delays with `Thread.sleep()`
- Synchronize access to a shared counter

---

## 📚 References

- [Java Thread – Oracle](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
- [Multithreading in Java – GeeksForGeeks](https://www.geeksforgeeks.org/multithreading-in-java/)

```

```
