package programmers.hash;

import java.util.Arrays;

/**
 * Project : coding-test
 * Class : programmers.hash.Participation
 * Version : v0.0.1
 * Created by chopinfrog on 9/4/19.
 */
public class Participation {

    public String solution(String[] participant, String[] completion) {

        String answer = "";


        Arrays.sort(participant);
        Arrays.sort(completion);

        // {"eden", "kiki", "leo"}
        // {"eden", "kiki"}

        int length = participant.length;

        for (int i = 0; i < length - 1; i++) {

            if (i != length -2) {
                if (!participant[i].equals(completion[i])) {
                    answer = participant[i];
                    break;
                }
            } else {
                answer = participant[length - 1];
                break;
            }
        }




        /*Boolean[] array = new Boolean[completion.length];
        Arrays.fill(array, Boolean.FALSE);

        for (int i = 0; i < participant.length; i++) {

            boolean isFlag = false;

            for (int j = 0; j < completion.length; j++) {

                if (participant[i].equals(completion[j]) && array[j] == false) {
                    array[j] = true;
                    isFlag = true;
                    break;
                }
            }

            if (!isFlag) {
                answer = participant[i];
                break;
            }
        }*/

        return answer;
    }

}
