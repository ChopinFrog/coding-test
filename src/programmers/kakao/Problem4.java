package programmers.kakao;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : coding-test
 * Class : programmers.kakao.Problem1
 * Version : v0.0.1
 * Created by chopinfrog on 9/7/19.
 */
public class Problem4 {

    public int[] solution(String[] words, String[] queries) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {

            int count = 0;
            for (int j = 0; j < words.length; j++) {

                if(words[j].matches(expressRegExp(queries[i]))) {
                    count++;
                }

            }
            list.add(count);
        }

        int[] array = new int[list.size()];

        int size=0;
        for(int item : list){
            array[size++] = item;
        }

        return array;
    }

    private String expressRegExp(String queries) {

        int count = 0;
        boolean isStartAlpha = false;


        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        sb.append("^");

        if (queries.charAt(0) != '?') {
            isStartAlpha = true;
        }

        for (int i = 0; i < queries.length(); i++) {

            if (queries.charAt(i) != '?') {
                temp.append(queries.charAt(i));

            } else {
                count++;
            }
        }

        if (isStartAlpha) {
            temp.append("[a-z]{");
            temp.append(count);
            temp.append("}");
            sb.append(temp.toString());
        } else {
            sb.append("[a-z]{");
            sb.append(count);
            sb.append("}");
            sb.append(temp.toString());
        }

        sb.append("$");


        return sb.toString();

    }
}
