// Write regex for IP validation
// IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.

import java.util.Scanner;
public class regex {
    public static void mainNotMain(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex {
        final String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    }
}
