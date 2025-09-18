
import java.util.*;



public class Account {
    int amount = 10000; //initial balance

    synchronized void withdraw (int amount){
        System.out.println("Available baance" + this.amount);
        System.out.println("Going to withdraw" + amount);

        if(this.amount < amount)
        {
            System.out.println("Insufficient balance waiting for deposit");

            try
            {
                wait();

            }catch(Exception e)
            {
                System.out.println("Interruption Occured");
            }
        }

        this.amount -= amount;
        System.out.println("Detected amount:" + amount);
        System.out.println("Balance amount:" + this.amount);

    }

    synchronized void deposit (int amount){
        System.out.println("Going to deposit" + amount);
        this.amount += amount;
        System.out.println("Deposited completed" + amount);
        System.out.println("Available balance is" + this.amount);
        notify();

    }

}
