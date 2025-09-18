class BankAccount {
    private int balance = 0;
    private int limit;

    public BankAccount(int limit) {
        this.limit = limit;
    }

    // Monica deposits money
    public synchronized void deposit(int amount) {
        while (balance + amount > limit) {
            try { wait(); } catch (Exception e) {}
        }
        balance += amount;
        System.out.println("Monica deposited " + amount + " | Balance = " + balance);
        notify();
    }

    // Ryan withdraws money
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try { wait(); } catch (Exception e) {}
        }
        balance -= amount;
        System.out.println("Ryan withdrew " + amount + " | Balance = " + balance);
        notify();
    }
}

// Producer (Monica)
class Monica extends Thread {
    BankAccount acc;
    public Monica(BankAccount acc) { this.acc = acc; }
    public void run() {
        for (int i = 0; i < 5; i++) { // 5 deposits
            acc.deposit(100);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

// Consumer (Ryan)
class Ryan extends Thread {
    BankAccount acc;
    public Ryan(BankAccount acc) { this.acc = acc; }
    public void run() {
        for (int i = 0; i < 5; i++) { // 5 withdrawals
            acc.withdraw(50);
            try { Thread.sleep(700); } catch (Exception e) {}
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500); // limit = 500
        new Monica(acc).start();
        new Ryan(acc).start();
    }
}
