import cracking.RecursiveFunction;
import java8.Lambda;
import programmers.level1.Submultiple;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //java8();
        //cracking();

        //level1();
    }


    public static void java8() {
        Lambda test = new Lambda();
        test.stream();
    }

    public static void cracking() {
        RecursiveFunction test = new RecursiveFunction();
        //IntStream.range(0,5).forEach( x -> System.out.println(test.fibonacci(x)));
        System.out.println(test.fibonacciWithCache(2));
    }

}

