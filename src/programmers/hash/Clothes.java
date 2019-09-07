package programmers.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project : coding-test
 * Class : programmers.hash.Clothes
 * Version : v0.0.1
 * Created by chopinfrog on 9/7/19.
 */
public class Clothes {

    public int solution(String[][] clothes) {
        int answer = 0;


        // (a + 1) - 1

        // 종류 2
        // 1 : a + b
        // 2 : a * b
        // a + b + a * b
        // (a + 1) * (b + 1) - 1

        // 종류 3
        // 1 : a + b + c = aC1 + bC1 + cC1
        // 2 : ab + ac + bc = aC1 * bC1 +
        // 3 : abc
        // (a + 1) * (b + 1) * (c + 1) - 1

        Map<String, List<String>> mapData = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (mapData.containsKey(clothes[i][1])) {
                mapData.get(clothes[i][1]).add(clothes[i][0]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(clothes[i][0]);
                mapData.put(clothes[i][1], list);
            }
        }

        List<Integer> num = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : mapData.entrySet()) {
            List<String> value = entry.getValue();
            num.add(value.size());
        }

        int temp = 1;
        for (int i = 0; i < num.size(); i++) {

            if (i == num.size() -1) {
                temp = temp * (num.get(i) + 1) - 1;
            } else {
                temp *= (num.get(i) + 1);
            }
        }
        answer = temp;

        return answer;
    }
}
