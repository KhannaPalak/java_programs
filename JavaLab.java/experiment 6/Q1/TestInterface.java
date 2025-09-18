// Q1 b)

// TestInterface.java
interface BaseInterface {
    void baseMethod();
}

interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

public class TestInterface implements DerivedInterface {
    @Override
    public void baseMethod() {
        System.out.println("Implemented baseMethod() from BaseInterface");
    }

    @Override
    public void derivedMethod() {
        System.out.println("Implemented derivedMethod() from DerivedInterface");
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.baseMethod();
        obj.derivedMethod();
    }
}
