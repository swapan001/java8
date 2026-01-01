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

class StreamFilter{

    /* find the employee whose name start with A */

    /* using filter and forEach */
    public static void filterNameStartWith(){
        List<String>nameList= Arrays.asList("Ayan","Shreya","Sayan","Tony","Sumit","Arka","Akshay");

        nameList.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
    }

    public static void squareEvenNumber(){
        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().filter(n-> (n%2==0)).map(n -> n*n).forEach(System.out::println);
    }




}
public class Stream {
    public static void main(String[] args) {
        StreamFilter.filterNameStartWith();
        StreamFilter.squareEvenNumber();
    }
}
