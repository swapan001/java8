package main.java_8.higher_order_function;

interface NewCalculator {
    double calculate(double a, double b);
}
public class Example2 {
    public static void main(String[] args) {
        double x=10;
        double y=5;
        calculator(x, y, (a, b) -> a + b, "Addition");
        calculator(x, y, (a, b) -> a - b, "Subtraction");
        calculator(x, y, (a, b) -> a * b, "Multiplication");
        calculator(x, y, (a, b) -> a / b, "Division");
    }
    static void calculator(double a, double b,NewCalculator operation, String operationName) {
        System.out.println(operationName + " is " + operation.calculate(a, b));
    }
}
