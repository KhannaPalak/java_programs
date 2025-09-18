// Demo.java
// Q1 C)
 
interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

public class Demo implements C {
    @Override
    public void methodA() {
        System.out.println("methodA() from A implemented in Demo");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() from B implemented in Demo");
    }

    @Override
    public void methodC() {
        System.out.println("methodC() from C implemented in Demo");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
