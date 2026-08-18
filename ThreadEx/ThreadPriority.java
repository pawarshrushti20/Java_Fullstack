package ThreadEx;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 11; i < 20; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        // Set thread priorities
        a.setPriority(10);
        b.setPriority(5);
        c.setPriority(1);

        // Start each thread only once
        a.start();
        b.start();
        c.start();
    }
}