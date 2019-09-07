package programmers.kakao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Project : coding-test
 * Class : programmers.kakao.Problem1
 * Version : v0.0.1
 * Created by chopinfrog on 9/7/19.
 */
public class Problem6 {

    public int solution(int n, int[] weak, int[] dist) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < weak.length; i++) {
            if (i == 0) {
                list.add(weak[1] - weak[0]);
            } else if ( i == weak.length - 1) {
                list.add(n - weak[weak.length - 1] + weak[0]);
            } else {
                list.add(weak[i+1] - weak[i]);
            }
        }

        int count = 1;

        for (int i = 1; i <= dist.length; i++) {

            if (aa(list) > dist[dist.length - i]) {
                count++;
            }
        }

        return count;
    }

    private int aa(List<Integer> list) {

        int max = 0;
        int sum = 0;
        for (Integer item : list) {
            sum += item;
            if (item > max) {
                max = item;
            }
        }
        sum = sum - max;

        for(Iterator<Integer> it = list.iterator(); it.hasNext() ; ) {
            Integer value = it.next();
            if(value == max) {
                it.remove();
            }
        }
        return sum;
    }
}
