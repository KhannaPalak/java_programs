import java.util.*;

class EWallet {
    ArrayList<Double> Transaction = new ArrayList<>();

    void addTransaction(double amount) {
        Transaction.add(amount);
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Transaction of Rupees " + amount + " has been added successfully. |");
        System.out.println("-------------------------------------------------------------");
    }

    void getTotalSpent() {
        double sum = 0;
        for (int i = 0; i < Transaction.size(); i++) {
            sum = sum + Transaction.get(i);
        }
        System.out.println("-------------------------------------");
        System.out.println("| Total amount spent: Rupees " + sum);
        System.out.println("-------------------------------------");
    }

    void getLargestTransaction() {
        double Largesttransaction = Double.MIN_VALUE;
        for (int i = 0; i < Transaction.size(); i++) {
            if (Largesttransaction < Transaction.get(i)) {
                Largesttransaction = Transaction.get(i);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("| Largest transaction is: Rupees " + Largesttransaction);
        System.out.println("-------------------------------------");
        
    }

    void printAllTransactions() {
        System.out.println("-------------------------------------");
        System.out.println("| All Transactions: ");
        for (int i = 0; i < Transaction.size(); i++) {
            System.out.println("| Rupees " + Transaction.get(i));
        }
        System.out.println("-------------------------------------");
    }

    void printAboveThreshold(double threshhold) {
        System.out.println("-------------------------------------");
        System.out.println("| Transactions above Rupees " + threshhold + ":");
        for (int i = 0; i < Transaction.size(); i++) {
            if (Transaction.get(i) > threshhold) {
                System.out.println("| Rupees" + Transaction.get(i));
            }
        }
        System.out.println("-------------------------------------");
    }

    void refundLastTransaction() {
        double lasttransaction = Transaction.remove(Transaction.size() - 1);
        System.out.println("-------------------------------------");
        System.out.println("| Last transaction of Rupees " + lasttransaction + " has been refunded.");
        System.out.println("| Updated Transactions:");
        for (int i = 0; i < Transaction.size(); i++) {
            System.out.println("| Rupees " + Transaction.get(i));
        }
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("***** WELCOME TO EWallet *****");

        EWallet mytransaction = new EWallet();

        mytransaction.addTransaction(200.07);
        mytransaction.addTransaction(300.08);
        mytransaction.addTransaction(400.09);
        mytransaction.addTransaction(500.10);

        mytransaction.getTotalSpent();

        mytransaction.getLargestTransaction();

        mytransaction.printAllTransactions();

        mytransaction.printAboveThreshold(355.06);

        mytransaction.refundLastTransaction();
    }
}
