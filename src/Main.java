import programmers.hash.Clothes;
import programmers.hash.Participation;
import programmers.hash.Phone;
import programmers.heap.Scoville;
import programmers.kakao.*;
import programmers.queue.Document;
import programmers.search.Math;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test 시작");


        // queue.Document
        //Document doc = new Document();
        //int[] sample = {2,1,3,2};
        //int location = 2;
        //int[] sample = {1,1,9,1,1,1};
        //int location = 0;
        //System.out.println(doc.queue(sample, location));


        // heap.Scoville
        //Scoville sco = new Scoville();
        //int[] scoville, int K
        /*
        scoville	K	return
[1, 2, 3, 9, 10, 12]	7	2
         */
        //int[] scoville = {1, 2, 3, 9, 10, 12};
        //int K = 7;
        //System.out.println(sco.solution(scoville, K));

        // search.Math
        //answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]
        //Math a = new Math();
        //int[] answers = {1,2,3,4,5};
        //System.out.println(a.solution(answers).toString());


        /*Participation a = new Participation();

        //String[] participant = {"leo", "kiki", "eden"};
        //String[] completion = {"eden", "kiki"};

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String result = a.solution(participant, completion);
        System.out.printf(result);*/


        /*Phone phone = new Phone();

        String[] phoneBook = {"119", "97674223", "1195524421"};
        phone.solution(phoneBook);
*/

        /*String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Clothes cloth = new Clothes();

        System.out.println(cloth.solution(clothes));*/






        Problem1 problem1 = new Problem1();

        //String temp = "aabbaccc";
        //String temp = "ababcdcdababcdcd";
        //String temp = "abcabcdede";
        //String temp = "abcabcabcabcdededededede";
        String temp = "xababcdcdababcdcd";

        ;
        System.out.println(problem1.solution(temp));


        /*Problem2 problem2 = new Problem2();

        String temp = "aabbaccc";
        //String temp = "ababcdcdababcdcd";
        //String temp = "abcabcdede";
        //String temp = "abcabcabcabcdededededede";
        //String temp = "xababcdcdababcdcd";

        problem2.solution(temp);*/


        /*Problem3 problem3 = new Problem3();

        int[][] key = {{0,0,1}, {1,0,0}, {0,1,1}};
        int[][] lock = {{1,1,1}, {1,1,0}, {1,0,1}};


        System.out.println(problem3.solution(key, lock));*/

        /*Problem4 problem4 = new Problem4();

        String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};

        String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};


        System.out.println(problem4.solution(words, queries));*/





       /* Problem6 problem6 = new Problem6();

        int n = 12;

        int[] week = {1,3,4,9,10};

        int[] dist = {3,5,7};

        //int[] week = {1,5,6,10};

        //int[] dist = {1,2,3,4};

        System.out.println(problem6.solution(n, week, dist));
*/



    }
}

