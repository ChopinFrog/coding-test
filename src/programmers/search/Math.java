package programmers.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Project : coding-test
 * Class : programmers.search.Math
 * Version :
 * Created by chopinfrog on 9/1/19.
 */
public class Math {


    // ..


    public int[] solution(int[] answers) {
        int[] answer = {};


        //Queue<Person> q = new LinkedList<>();

        //Person a1 = new Person(1, person1(answers));
        //Person a2 = new Person(2, person2(answers));
        //Person a3 = new Person(3, person3(answers));

        int a1 = person1(answers);
        int a2 = person2(answers);
        int a3 = person3(answers);

        int[] score = {a1,a2,a3};

        Queue<Integer> temp = new LinkedList<>();

        int max = 0;
        for (int i = 0; i < score.length; i++) {

            if (i == 0) {
                max = score[0];
                temp.offer(0);
                continue;
            }

            if (score[i] > max) {

                max = score[i];
                temp.remove();
                temp.offer(i);

            } else if (score[i] == max) {

                temp.offer(i);
            }
        }

        for (Integer item : temp) {
            System.out.printf(item.toString());
        }










        return answer;
    }


    private int person1(int[] answers) {

        int result = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == (i+1) % 5) {
                result++;
            }
        }
        return result;
    }

    private int person2(int[] answers) {

        int result = 0;
        int[] person2 = {2,1,2,3,2,4,2,5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person2[(i+1) % 8]) {
                result++;
            }
        }
        return result;
    }

    private int person3(int[] answers) {

        int result = 0;
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person3[(i+1) % 10]) {
                result++;
            }
        }
        return result;
    }


}
