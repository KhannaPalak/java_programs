import java.util.ArrayList;

class EWallet 
{
    ArrayList<Double> transactions = new ArrayList<>();

    public void addTransaction(double amount) 
    {
        transactions.add(amount);

    }

    public double getTotalSpent() 
    {
        double total = 0;
        for (int i = 0; i < transactions.size(); i++) 
        {
            total = total + transactions.get(i);
        }
        return total;
    }

    public double getLargestTransaction() 
    {
        double largest = 0;
        for (int i = 0; i < transactions.size(); i++) 
        {
            if (transactions.get(i) > largest) 
            {
                largest = transactions.get(i);
            }
        }
        return largest;
    }

    public void printAllTransactions() 
    {
        System.out.println("All transactions:");
        for (int i = 0; i < transactions.size(); i++) 
        {
            System.out.println("Rs. " + transactions.get(i));
        }
    }

    public void printAboveThreshold(double threshold) 
    {
        System.out.println("Transactions above Rs. " + threshold + ":");
        for (int i = 0; i < transactions.size(); i++) 
        {
            if (transactions.get(i) > threshold) 
            {
                System.out.println("Rs. " + transactions.get(i));
            }
        }
    }

    public void refundLastTransaction() 
    {
       if (!transactions.isEmpty()) 
       {
        double last = transactions.remove(transactions.size() - 1);
        System.out.println("Refunded: Rs. " + last);
       } 
       else 
       {
        System.out.println("No transaction to refund.");
       }
        printAllTransactions();
    }

    public static void main(String[] args) 
    {
        EWallet myWallet = new EWallet();
        myWallet.addTransaction(150.0);
        myWallet.addTransaction(499.99);
        myWallet.addTransaction(1200.0);
        myWallet.addTransaction(350.5);
        myWallet.addTransaction(700.0);
        myWallet.addTransaction(80.0);
        myWallet.addTransaction(999.0);
        myWallet.addTransaction(20.0);
        myWallet.addTransaction(530.0);
        myWallet.addTransaction(420.0);

        myWallet.printAllTransactions();


        double total = myWallet.getTotalSpent();
        System.out.println("Total spent: Rs. " + total);

        double largest = myWallet.getLargestTransaction();
        System.out.println("Largest transaction: Rs. " + largest);

        myWallet.printAboveThreshold(500.0);

        myWallet.refundLastTransaction();
    }
}
