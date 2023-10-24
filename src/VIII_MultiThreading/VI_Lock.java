package VIII_MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private Lock accountLock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        accountLock.lock();
        try {
            balance += amount;
            System.out.println("Deposited: $" + amount + "\t" + "Current Balance: $" + balance);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            accountLock.unlock();
        }
    }

    public void withdraw(double amount) {
        accountLock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount + "\t" + "Current Balance: $" + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            accountLock.unlock();
        }
    }
}

public class VI_Lock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(200);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(300);
            }
        });

        // Start the threads
        depositThread.start();
        withdrawThread.start();

        // Wait for threads to complete
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Observe that first deposits are performed, remove lock and compare the result
        // Print the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
