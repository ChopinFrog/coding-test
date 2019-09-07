package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project : coding-test
 * Class : programmers.kakao.Problem1
 * Version : v0.0.1
 * Created by chopinfrog on 9/7/19.
 */
public class Problem1 {

    public int solution(String s) {
        //int answer = 0;

        // aabbaccc

        // 절반까지만 돌리면 됨
        // 1
        // 2a2ba3c -> 7
        // 2
        // aabbaccc -> 8
        // 3
        // aabbaccc -> 8
        // 4
        // aabbaccc -> 8


        // 자료 구조에 넣을 것
        /*Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }

        int countLength =  s.length() / 2;
        String temp = "";

        while(!q.isEmpty()) {

            //for (int i = 1; i <= countLength; i++) {

                for  (int j = 0; j < q.size(); j = j + 1) {

                }



            //}


        }*/

        /*String resultString = "";
        String tempString = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i == 0) {
                tempString = String.valueOf(s.charAt(0));
            } else if (s.charAt(i) == s.charAt(i-1)){

                count++;


            }
        }*/

        /*String temp = "";

        // substring 사용할 것
        for (int i = 0; i < s.length(); i++) {
             //temp = s.substring(0, 1);

            if (i== 0) {
                temp = s.substring(0, 1);
            } else {
                temp = s.substring(0, 1);
                if (temp.equals())
            }
        }*/


        // 01234567
        // aabbaccc
        // length 8


        //StringBuilder sb = new StringBuilder();



        //int j = 1;


        int j = s.length() / 2;

        //System.out.println(sb.toString());

        int min = 0;
        int temp = 0;

        for (int i = 1; i <= j; i++) {

            if (i == 1) {
                min = aa(i, s).replace("1", "").length();
            } else {
                temp = aa(i, s).replace("1", "").length();
                if (temp < min) {
                    min = temp;
                }
            }
        }

        return min;
    }

    private String aa(int j, String s) {

        StringBuilder sb = new StringBuilder();
        String temp = "";
        String temp2 = "";
        int count = 1;


        for (int i = 0; i < s.length(); i=i+j) {

            if ( i == 0 ) {

                temp = s.substring(0, j);
            } else {

                if ( i >= s.length() - j){
                    temp2 = s.substring(i, s.length());
                } else {
                    temp2 = s.substring(i, i + j);
                }

                if (temp.equals(temp2)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(temp);
                    temp = temp2;
                    count = 1;
                }
            }
        }
        sb.append(count);
        sb.append(temp2);

        return sb.toString();
    }
}
