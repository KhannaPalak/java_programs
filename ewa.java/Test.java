import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    private final Queue<String> queue = new LinkedList<>();
    private final int CAPACITY = 10;

    // Add element (Producer)
    public synchronized void add(String item) {
        while (queue.size() == CAPACITY) {
            try {
                wait(); // queue full → wait
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // wake up waiting consumers
    }

    // Remove element (Consumer)
    public synchronized String remove() {
        while (queue.isEmpty()) {
            try {
                wait(); // queue empty → wait
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String item = queue.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // wake up producer
        return item;
    }
}

// Producer Thread
class Producer implements Runnable {
    private final MyQueue myQueue;

    Producer(MyQueue q) { this.myQueue = q; }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.add(new Date().toString());
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
    }
}

// Consumer Thread
class Consumer implements Runnable {
    private final MyQueue myQueue;

    Consumer(MyQueue q) { this.myQueue = q; }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.remove();
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        Thread producer = new Thread(new Producer(q));
        Thread consumer = new Thread(new Consumer(q));

        producer.start();
        consumer.start();
    }
}