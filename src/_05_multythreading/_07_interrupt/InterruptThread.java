package _05_multythreading._07_interrupt;

import lombok.SneakyThrows;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                System.out.println("I am running...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    return;
                }
            } else {
                return;
            }
        } while (true);
    }
}
