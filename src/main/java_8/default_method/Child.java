package main.java_8.default_method;
/* in java-8 the interface can have default method and static method */
/* in java-8 the interface can have private static method */
/* default method can have body and it's not mandatory to override by child */
interface Papa {
    static double balance = 10000;
    public double bankBalance();
    public default void  print() {
        System.out.println("Papa");
    }
}

interface Mummy {
    static double balance = 5000;
    public double laxmiBhander();
    public default void print() {
        System.out.println("Mummy");
    }
}

public class Child implements Papa, Mummy {
    @Override
    public double bankBalance() {
        return Papa.balance;
    }

    @Override
    public double laxmiBhander() {
        return Mummy.balance;
    }


    /* here we override the print method because there same methods are present in both parent
    *  to avoid the ambiguity we can use super keyword
    * */
    @Override
    public void print() {
        Papa.super.print();
        Mummy.super.print();
        System.out.println("Child");
    }

    public void myBalance() {
        System.out.println("My balance is " + (bankBalance() + laxmiBhander()));
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        System.out.println("Papa's balance is " + child.bankBalance());
        System.out.println("Mummy's balance is " + child.laxmiBhander());
        child.myBalance();
    }
}



