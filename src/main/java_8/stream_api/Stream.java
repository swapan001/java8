package main.java_8.stream_api;


/*
*   Uses lambda expressions and method references
*   Intermediate operations are not executed until terminal operation is called
*   Multiple operations can be chained together
*   Stream can be consumed only once
*   Does not change the original collection
*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamFilter{

    /* find the employee whose name start with A */

    /* using filter and forEach */

    private static List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    public static void filterNameStartWith(){
        List<String>nameList= Arrays.asList("Ayan","Shreya","Sayan","Tony","Sumit","Arka","Akshay");

        nameList.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
    }


    /* square of all evenNumber*/
    public static void squareEvenNumber(){
        System.out.println("\tsquare of all evenNumber");
        numbers.stream().filter(n-> (n%2==0)).map(n -> n*n).forEach(System.out::println);
    }

    /* qube of all OddNumber*/
    public static void qubeOddNumber(){
        System.out.println("\tqube of all OddNumber");
        numbers.stream().filter(n -> ((n/2)*2)!=n).map(n -> n*n*n).forEach(System.out::println);
    }

    public static void squareEvenCubeOdd() {
        System.out.println("Even numbers squared and odd numbers cubed");
        List<Integer>updatedList;
        updatedList = numbers.stream()
                .map(n -> n % 2 == 0 ? n * n : n * n * n)
                .collect(Collectors.toList());
        updatedList.forEach(System.out::println);
    }








}
public class Stream {
    public static void main(String[] args) {
        StreamFilter.filterNameStartWith();
        StreamFilter.squareEvenNumber();
        StreamFilter.qubeOddNumber();
        StreamFilter.squareEvenCubeOdd();
    }
}
