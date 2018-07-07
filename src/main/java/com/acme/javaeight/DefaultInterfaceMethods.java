package com.acme.javaeight;

interface Interface1 {

    void methodFromInterface1(String str);

    default void log(String str) {
        System.out.println("I1 logging::" + str);
    }

}

interface Interface2 {

    void methodFromInterface2();

    default void log(String str) {
        System.out.println("I2 logging::" + str);
    }

}

public class DefaultInterfaceMethods implements Interface1, Interface2 {

    @Override
    public void methodFromInterface1(String str) {
    }

    @Override
    public void methodFromInterface2() {
    }

    @Override
    public void log(String str) {
        // Must be overridden to resolve diamond problem
        System.out.println("MyClass logging::" + str);
    }


    public static void main(String[] args) {
        DefaultInterfaceMethods df = new DefaultInterfaceMethods();
        df.log("yo");
    }

}
