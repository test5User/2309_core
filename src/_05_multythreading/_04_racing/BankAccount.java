package _05_multythreading._04_racing;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccount {
    private long balance;

    public synchronized void withdraw(long amount) {
        var newBalance = balance - amount;
        balance = newBalance;
    }

    public synchronized void deposit(long amount) {
        var newBalance = balance + amount;
        balance = newBalance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
