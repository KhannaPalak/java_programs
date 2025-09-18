import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double d = b * b - 4 * a * c; // discriminant

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Real and Distinct Roots: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Real and Equal Roots: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Complex Roots: " + real + " ± " + imag + "i");
        }
    }
}