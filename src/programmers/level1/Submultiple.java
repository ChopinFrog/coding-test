package programmers.level1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Project : coding-test
 * Class : programmers.level1.Submultiple
 * Version : v0.0.1
 * Created by hyungwoo.cho on 9/22/19.
 */
public class Submultiple {

    /**
     * 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
     *
     * 제한 사항
     * n은 0 이상 3000이하인 자연수입니다.
     * 입출력 예
     * n	return
     * 12	28
     * 5	6
     * 입출력 예 설명
     * 입출력 예 #1
     * 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
     *
     * 입출력 예 #2
     * 5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
     * @param n
     * @return
     */
    public int submultiple(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).sum();
    }

    /**
     * 소수 찾기
     * 문제 설명
     * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
     *
     * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
     * (1은 소수가 아닙니다.)
     *
     * 제한 조건
     * n은 2이상 1000000이하의 자연수입니다.
     * 입출력 예
     * n	result
     * 10	4
     * 5	3
     * 입출력 예 설명
     * 입출력 예 #1
     * 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
     *
     * 입출력 예 #2
     * 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
     * @param n
     * @return
     */
    public int prime(int n) {

        boolean[] flags = new boolean[n + 1];
        flags = sieveOfEratosthenes(flags, n);
        int count = 0;
        for (boolean item : flags) {
            if (item) count++;
        }
        return count;
    }

    boolean[] sieveOfEratosthenes(boolean[] flags, int max) {

        Arrays.fill(flags, 2, max+1, true);
        int prime = 2;

        while (prime <= Math.sqrt(max)) {
            flags = crossOff(flags, prime);
            prime = getNextPrime(flags, prime);
        }
        return flags;
    }

    boolean[] crossOff(boolean[] flags, int prime) {

        for (int i = prime * prime; i < flags.length; i += prime) {
            flags[i] = false;
        }
        return flags;
    }

    int getNextPrime(boolean[] flags, int prime) {
        int next = prime + 1;
        while (next < flags.length && !flags[next]) {
            next++;
        }
        return next;
    }

    /**
     * K번째수
     * 문제 설명
     * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
     *
     * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
     *
     * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
     * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
     * 2에서 나온 배열의 3번째 숫자는 5입니다.
     * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * array의 길이는 1 이상 100 이하입니다.
     * array의 각 원소는 1 이상 100 이하입니다.
     * commands의 길이는 1 이상 50 이하입니다.
     * commands의 각 원소는 길이가 3입니다.
     * 입출력 예
     * array	commands	return
     * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
     * 입출력 예 설명
     * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
     * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
     * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
     *
     * 출처
     * @param array
     * @param commands
     * @return
     */
    public int[] kth(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int count = 0;
        for (int[] item : commands) {
            List<Integer> temp = new ArrayList<>();
            for ( int i = item[0] - 1; i < item[1]; i++) {
                temp.add(array[i]);
            }
            Collections.sort(temp);
            answer[count] = temp.get(item[2]);
            count++;
        }

        return answer;
    }





    public static void main(String[] args) {
        Submultiple c = new Submultiple();
        //System.out.println(c.submultiple(12));
        //System.out.println(c.prime(10));
        //System.out.println(c.kth());
    }
}
