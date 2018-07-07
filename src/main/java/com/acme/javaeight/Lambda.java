package cloud.bastis.javaeight;

interface LambdaInterface1 {

    void methodFromInterface1(String str);

}

public class Lambda {

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------------------
        // Java <= 7 version
        LambdaInterface1 if1 = new LambdaInterface1() {
            public void methodFromInterface1(String str) {
                System.err.println(str);
            }
        };
        if1.methodFromInterface1("anonymous inner class");

        // ----------------------------------------------------------------------------------------------------
        // Lambda version

        LambdaInterface1 if2 = (str) -> System.err.println(str);
        if2.methodFromInterface1("lambda");

        // ----------------------------------------------------------------------------------------------------
        // Method reference version

        LambdaInterface1 if3 = System.err::println;
        if3.methodFromInterface1("lambda method reference");
    }

}
