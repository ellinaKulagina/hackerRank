//Alice and Bob each created one problem for HackerRank.
//A reviewer rates the two challenges by three categories: problem clarity, originality, and difficulty.
//Both raitings are triplets. Your task is to find their comparison points by comparing  a[0] with b[0] etc.
//Complete the function compareTriplets, it must return an array of two integers,
//the first being Alice's score and the second being Bob's.

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class compareTriplets {
    public static void mainNotMain(String[] args) throws IOException {
        List<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(1);
        aList.add(1);

        List<Integer> bList = new ArrayList<Integer>();
        bList.add(2);
        bList.add(2);
        bList.add(2);


        int Ascore = 0;
        int Bscore = 0;

        for(int i=0; i<3; i++){
            if(aList.get(i) > bList.get(i)){
                Ascore++;
            }
            else if(aList.get(i) < bList.get(i)){
                Bscore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(Ascore);
        result.add(Bscore);

        System.out.println(result);
    }
}
