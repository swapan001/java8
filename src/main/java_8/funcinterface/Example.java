package main.java_8.funcinterface;


/* functional interface is an interface having only one abstract method */
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
public class Example {
    public static void main(String[] args) {

        /* with  lambda expression */
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("swapan001");
    }
}
