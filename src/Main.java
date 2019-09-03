import programmers.heap.Scoville;
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
        Math a = new Math();
        int[] answers = {1,2,3,4,5};
        System.out.println(a.solution(answers).toString());




    }
}

