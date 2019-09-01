//You are given  pairs of strings.
//After taking each pair as input, you need to print number of unique pairs you currently have.

import java.util.*;

public class hashSet {
    public static void mainNotMain(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> list = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String str = pair_left[i] + " " + pair_right[i];
            list.add(str);
            System.out.println(list.size());
        }
    }
}
