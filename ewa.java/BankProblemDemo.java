import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    
    public void withdraw(String person, int amount) {
        if (balance >= amount) {
            System.out.println(person + " is going to withdraw " + amount);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(person + " was interrupted during withdrawal.");
            }

            balance -= amount;
            System.out.println(person + " completed the withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + person + " to withdraw " + amount);
        }
    }

   
    public synchronized void withdrawSafe(String person, int amount) {
        if (balance >= amount) {
            System.out.println(person + " is going to withdraw " + amount);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(person + " was interrupted during withdrawal.");
            }

            balance -= amount;
            System.out.println(person + " completed the withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + person + " to withdraw " + amount);
        }
    }
}

class Person implements Runnable {
    private BankAccount account;
    private String name;
    private boolean useSync; 

    public Person(BankAccount account, String name, boolean useSync) {
        this.account = account;
        this.name = name;
        this.useSync = useSync;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            if (useSync) {
                account.withdrawSafe(name, 100); 
            } else {
                account.withdraw(name, 100); 
            }
        }
    }
}

public class BankProblemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take initial balance from user
        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        System.out.println("\n--- Demonstrating WITHOUT synchronization (Problematic) ---");
        BankAccount acc1 = new BankAccount(balance);
        Thread ryan1 = new Thread(new Person(acc1, "Ryan", false));
        Thread monica1 = new Thread(new Person(acc1, "Monica", false));

        ryan1.start();
        monica1.start();

        try {
            ryan1.join();
            monica1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("\n--- Demonstrating WITH synchronization (Fixed) ---");
        BankAccount acc2 = new BankAccount(balance);
        Thread ryan2 = new Thread(new Person(acc2, "Ryan", true));
        Thread monica2 = new Thread(new Person(acc2, "Monica", true));

        ryan2.start();
        monica2.start();
    }
}
