//Function must return the sum of the array elements as an integer.

import java.io.IOException;
import java.util.Scanner;

public class simpleArraySum {
    public static void mainNotMain(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] digitals = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            digitals[i] = in.nextInt();
        }

        for (int d : digitals) sum += d;
        System.out.println(sum);
    }
}
