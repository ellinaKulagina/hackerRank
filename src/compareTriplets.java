import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
