package programmers.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project : conding-programmers
 * Class : programmers.queue.Document
 * Version :
 * Created by chopinfrog on 9/1/19.
 */
public class Document {

    public static class Doc {

        int priority;
        int location;

        public Doc(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }


    public static int queue(int[] priorities, int location) {

        // 입 력: 2, 1, 3, 2
        // 4, 8, 2, 3, 1, 5, 4

        // 1. 초기화 단계
        // - 자료구조를 선택하고, 해당 자료구조에 자료를 넣음
        // - 주의할 것은 index 정보도 함께 따라가야 한다.
        int solution = 0;
        Queue<Doc> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) q.offer(new Doc(priorities[i], i));

        while(!q.isEmpty()) {

            Doc temp = q.poll();

            boolean hasBigValue = false;

            for (Doc item : q) {

                if (item.priority > temp.priority) {
                    q.offer(temp);
                    hasBigValue = true;
                    break;
                }
            }

            if (!hasBigValue) {
                solution++;
                if (temp.location == location) {
                    break;
                }
            }
        }

        return solution;
    }
}
