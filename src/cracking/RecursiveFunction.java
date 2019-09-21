package cracking;

import java.util.stream.IntStream;

/**
 * Project : coding-test
 * Class : cracking.RecursiveFunction
 * Version : v0.0.1
 * Created by hyungwoo.cho on 9/21/19.
 */
public class RecursiveFunction {


    /**
     * Fibonacci arrays without Cache
     * f(n) = f(n-1) + f(n-2)
     * 일반항을 먼저 구한다.
     *
     * @param n number to find nth
     * @return int
     */
    public int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }


    /**
     * Fibonacci arrays without Cache
     * f(n) = f(n-1) + f(n-2)
     * 일반항을 먼저 구한다. 상향식 동적 프로그래밍
     *
     * @param n number to find nth
     * @return int
     */
    public int fibonacciWithCache(int n) {

        if (n == 0 || n == 1) return n;
        int[] cache = new int[n];
        cache[0] = 0;
        cache[1] = 1;
        IntStream.range(2, n).forEach(x -> cache[x] = cache[x-1] + cache[x-2]);
        return cache[n-1] + cache[n-2];
    }
    
}
