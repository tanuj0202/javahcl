package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task13_BankAccountThreads {
    static class BankAccount {
        private double balance = 0;
        private final Object lock = new Object();

        public void deposit(double amount) {
            synchronized (lock) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposited " + amount + " | Balance: " + balance);
            }
        }

        public void withdraw(double amount) {
            synchronized (lock) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " | Balance: " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " | Insufficient funds | Balance: " + balance);
                }
            }
        }

        public double getBalance() {
            synchronized (lock) {
                return balance;
            }
        }
    }

    static class TransactionTask implements Runnable {
        BankAccount account;
        boolean isDeposit;
        double amount;

        TransactionTask(BankAccount account, boolean isDeposit, double amount) {
            this.account = account;
            this.isDeposit = isDeposit;
            this.amount = amount;
        }

        @Override
        public void run() {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter number of deposit threads: ");
        int depositThreads = sc.nextInt();
        System.out.print("Enter number of withdrawal threads: ");
        int withdrawThreads = sc.nextInt();
        sc.close();

        BankAccount account = new BankAccount();
        ExecutorService executor = Executors.newFixedThreadPool(depositThreads + withdrawThreads);

        Random rand = new Random();
        for (int i = 0; i < depositThreads; i++) {
            double amount = 100 + rand.nextInt(900);
            executor.execute(new TransactionTask(account, true, amount));
        }
        for (int i = 0; i < withdrawThreads; i++) {
            double amount = 50 + rand.nextInt(500);
            executor.execute(new TransactionTask(account, false, amount));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}