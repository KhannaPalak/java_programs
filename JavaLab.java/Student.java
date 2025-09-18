// MyClasses.java
// Contains all helper classes (Student, Triangle, Area, Complex, Point)

class Student {
    private String name;
    private int roll_no;

    // Constructor
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }
}

// ================= TRIANGLE =================
class Triangle {
    private int a, b, c;

    // Non-parameterized constructor
    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// ================= AREA (RECTANGLE) =================
class Area {
    private double length;
    private double breadth;

    // Constructor
    public Area(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double returnArea() {
        return length * breadth;
    }
}

// ================= COMPLEX =================
class Complex {
    private double real;
    private double imag;

    public Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex multiply(Complex other) {
        return new Complex(
            this.real * other.real - this.imag * other.imag,
            this.real * other.imag + this.imag * other.real
        );
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}

// ================= POINT =================
class Point {
    private float x;
    private float y;

    // Non-parameterized constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() { return x; }
    public float getY() { return y; }

    // Setters
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }

    // Static method to calculate distance between two points
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    // Display with width 7 and precision 2
    public void display() {
        System.out.printf("%7.2f %7.2f\n", x, y);
    }
}
