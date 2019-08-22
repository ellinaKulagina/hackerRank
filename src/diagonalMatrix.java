import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class diagonalMatrix {
    public static void mainNotMain(String[] arg){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        list.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(11);
        a2.add(12);
        a2.add(13);
        list.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(21);
        a3.add(22);
        a3.add(23);
        list.add(a3);

        int size = list.size();
        int result = 0;
        int left = 0;
        int right = 0;
        int j = size-1;

        for(int i=0; i < size; i++){
            left += list.get(i).get(i);
            right += list.get(i).get(j);
            j--;
        }
        result = Math.abs(left - right);

    }
}
