package _05_multythreading._02_creation;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Executing in: " + Thread.currentThread());
        System.out.println("Hello from thread");
    }
}
