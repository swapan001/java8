package main.java_8.higher_order_function;


/*
* Higher Order Function that takes a function as an argument or returns a function
*/
interface MyCalculator {
    void add(double a,double b);
    void sub(double a, double b);
    void mul(double a, double b);
    void div(double a, double b);
}

class Calculator {
    public void calculate(double a,double b,MyCalculator myCalculator) {
        myCalculator.add(a, b);
        myCalculator.sub(a,b);
        myCalculator.mul(a, b);
        myCalculator.div(a, b);
    }
}
public class Example {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();

        int a=10;
        int b=5;
        calculator.calculate(a, b, new MyCalculator() {
            @Override
            public void add(double a, double b) {
                System.out.println("Addition is " + (a + b));
            }

            @Override
            public void sub(double a, double b) {
                System.out.println("Subtraction is " + (a - b));
            }

            @Override
            public void mul(double a, double b) {
                System.out.println("Multiplication is " + (a * b));
            }

            @Override
            public void div(double a, double b) {
                System.out.println("Division is " + (a / b));
            }
        });
    }
}
