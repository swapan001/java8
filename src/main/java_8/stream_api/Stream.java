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
    public static void filterNameStartWith(){
        List<String>nameList= Arrays.asList("Ayan","Shreya","Sayan","Tony","Sumit","Arka","Akshay");

        nameList.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
    }
}
public class Stream {
    public static void main(String[] args) {
        StreamFilter.filterNameStartWith();

    }
}
