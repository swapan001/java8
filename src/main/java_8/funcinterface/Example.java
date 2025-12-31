package main.java_8.funcinterface;


/* functional interface is an interface having only one abstract method */
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

@FunctionalInterface
interface AddTwoNum{
    int add(int a, int b);
}

@FunctionalInterface
interface DivNum{
    double div(double a, double b);
}

@FunctionalInterface
interface MulNum{
    double mul(double a, double b);
}

public class Example {
    public static void main(String[] args) {

        /* with  lambda expression */
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("swapan001");

        AddTwoNum addTwoNum = (a,b) -> a+b;
        System.out.println("Result: "+addTwoNum.add(10,20));

        DivNum divNum=(a,b)->(a/b);
        System.out.println("Result: "+divNum.div(10,4));

        MulNum mulNum=(a, b)->(a*b);
        System.out.println("Result: "+mulNum.mul(10, 4));

    }
}
