import java.util.Random;

// Thread to generate random numbers
class NumberGenerator implements Runnable {
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                int num = rand.nextInt(100); // generates a random number from 0–99
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    // If number is even, start a thread to compute square
                    Thread t1 = new Thread(new SquareCalculator(num));
                    t1.start();
                } else {
                    // If number is odd, start a thread to just print it
                    Thread t2 = new Thread(new OddPrinter(num));
                    t2.start();
                }

                Thread.sleep(1000); // wait 1 second before generating next number
            }
        } catch (InterruptedException e) {
            System.out.println("NumberGenerator interrupted.");
        }
    }
}

// Thread to compute square of even numbers
class SquareCalculator implements Runnable {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Thread to print odd numbers
class OddPrinter implements Runnable {
    private int number;

    public OddPrinter(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Odd Number: " + number);
    }
}

// Main Class
public class MultiThreadApp {
    public static void main(String[] args) {
        Thread generatorThread = new Thread(new NumberGenerator());
        generatorThread.start();
    }
}
