package main.java_8.staticmethod;


interface Parent{

    public default void m(){
        System.out.println("default method of parent interface");
    }
    static void m1(){
        System.out.println("static method of parent Interface");
    }
}
public class Child implements Parent {

    public void m(){
        Parent.super.m();   //to call parent interface default method
        System.out.println("overriding default method of parent interface in child class");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.m();
        Parent.m1();    //we can access parent interface static methods directly
    }
}
