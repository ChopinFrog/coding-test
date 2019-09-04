package programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Project : coding-test
 * Class : programmers.heap.Scoville
 * Version :
 * Created by chopinfrog on 9/1/19.
 */
public class Scoville {

    //..

    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> q = new PriorityQueue<>();

        for (int item : scoville) {
            q.offer(item);
        }

        while(!q.isEmpty()) {

            int temp1 = q.poll();
            if (temp1 > K) {
                return answer;
            } else {
                if (q.size() == 0) {
                    return -1;
                }  else {
                    int temp2 = q.poll();
                    q.offer( temp1 + temp2 * 2);
                    answer++;
                }
            }
        }
        return answer;
    }
}
