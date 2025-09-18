import java.util.Scanner;
public class ComplexApp {
    public static void main(String[] args) {
        System.out.println("Palak, 24csu325");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex no.: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex no.: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        System.out.print("Enter real part of second complex no.: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex no.: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);
        System.out.print("Sum: ");
        c1.add(c2).display();
        System.out.print("Difference: ");
        c1.subtract(c2).display();
        System.out.print("Product: ");
        c1.multiply(c2).display();
    }
}