// Q1. A)

class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Inside Parent class");
    }
}

interface FirstInterface {
    void method1();
}

interface SecondInterface {
    void method2();
}

public class Child extends Parent implements FirstInterface, SecondInterface {
    Child() {
        super(); 
        System.out.println("Child constructor called");
    }

    @Override
    public void method1() {
        System.out.println("method1() from FirstInterface implemented in Child");
    }

    @Override
    public void method2() {
        System.out.println("method2() from SecondInterface implemented in Child");
    }

    @Override
    void display() {
        System.out.println("Overridden display() in Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.method1();
        obj.method2();
    }
}
