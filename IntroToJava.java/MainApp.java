// MainApp.java
// Main driver program to test all classes

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Student
        Student s1 = new Student("John", 2);
        System.out.println("Student Name: " + s1.getName() + ", Roll No: " + s1.getRollNo());

        // 2. Triangle
        Triangle t = new Triangle();
        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter());

        // 3. Rectangle Area
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        Area rect = new Area(l, b);
        System.out.println("Area of Rectangle: " + rect.returnArea());

        // 4. Complex numbers
        System.out.print("Enter real part of first complex: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex: ");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real part of second complex: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex: ");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));

        // 5. Distance between 2 points
        System.out.print("Enter x1: ");
        float x1 = sc.nextFloat();
        System.out.print("Enter y1: ");
        float y1 = sc.nextFloat();
        Point p1 = new Point(x1, y1);

        System.out.print("Enter x2: ");
        float x2 = sc.nextFloat();
        System.out.print("Enter y2: ");
        float y2 = sc.nextFloat();
        Point p2 = new Point(x2, y2);

        System.out.println("Points are: ");
        p1.display();
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %.2f\n", dist);

        sc.close();
    }
}
