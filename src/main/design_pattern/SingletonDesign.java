package main.design_pattern;



/*
*Singleton ensures a class has only one instance and provides a global access point.
*A common real-world example is a configuration manager that loads settings once
* and shares them across the application.
*/

class Singleton{
    private static volatile Singleton instanceOfSingleton;
    private Singleton(){
        //here we initialize
    }
    public static Singleton getSingleton(){
        if(instanceOfSingleton == null){        // 1st check (no lock)
            synchronized (Singleton.class){
                if(instanceOfSingleton == null){    // 2nd check (with lock)
                    instanceOfSingleton=new Singleton();
                }

            }

        }
        return instanceOfSingleton;
    }
}
public class SingletonDesign {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        Singleton singleton1=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();

        System.out.println((singleton1 == singleton)&&(singleton2 == singleton));
    }
}
