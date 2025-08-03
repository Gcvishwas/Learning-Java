package Threads;

// Thread A: Even numbers from 50 to 100
class ThreadA implements Runnable {
    public void run() {
        System.out.println("Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Thread B: Odd numbers from 100 to 200
class ThreadB implements Runnable {
    public void run() {
        System.out.println("Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Main class
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        t1.start();
        t2.start();
    }
}
