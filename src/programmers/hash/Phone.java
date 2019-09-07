package programmers.hash;

import java.util.Arrays;

/**
 * Project : coding-test
 * Class : programmers.hash.Participation
 * Version : v0.0.1
 * Created by chopinfrog on 9/4/19.
 */
public class Phone {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length-1; i++) {

            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        /*for (String item : phone_book) {
            System.out.println(item);
        }*/
        System.out.println(answer);



        return answer;
    }

}
