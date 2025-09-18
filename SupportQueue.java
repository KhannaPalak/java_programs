import java.util.LinkedList;

public class SupportQueue 
{
    
    LinkedList<String> queue;
    public SupportQueue() 
    {
        queue = new LinkedList<>();
    }
    public void addCustomer(String name) 
    {
        queue.add(name);
    }
    public String serveCustomer() 
    {
        if (!queue.isEmpty()) 
        {
            String served = queue.poll(); 
            System.out.println("Served: " + served);
            return served;
        } 
        else 
        {
            System.out.println("No customers to serve.");
            return null;
        }
    }
    public String peekNextCustomer() 
    {
        if (!queue.isEmpty()) 
        {
            return queue.peek();
        } 
        else 
        {
            return "No one is waiting.";
        }
    }
    public void printQueue() 
    {
        System.out.println("Current queue:");
        for (int i = 0; i < queue.size(); i++) 
        {
            System.out.println((i + 1) + ". " + queue.get(i));
        }
    }
    public void reAddCustomerToEnd(String name) 
    {
        queue.add(name);
        System.out.println(name + " has been re-added to the end of the queue.");
    }
    public void prioritizeCustomer(String name) 
    {
        if (queue.remove(name)) 
        {
            queue.addFirst(name);
            System.out.println(name + " has been moved to the front of the queue.");
        } 
        else 
        {
            System.out.println(name + " not found in queue.");
        }
    }
    public static void main(String[] args) 
    {
        SupportQueue myQueue = new SupportQueue();

        myQueue.addCustomer("Akshat");
        myQueue.addCustomer("Shruti");
        myQueue.addCustomer("Rahul");
        myQueue.addCustomer("Palak");
        myQueue.addCustomer("Karan");
        myQueue.addCustomer("Neha");

        myQueue.printQueue();

        myQueue.serveCustomer();
        myQueue.serveCustomer();
        myQueue.printQueue();
        System.out.println("Next in line: " + myQueue.peekNextCustomer());
        myQueue.reAddCustomerToEnd("Akshat");
        myQueue.prioritizeCustomer("Palak");
        myQueue.printQueue();
    }
}
