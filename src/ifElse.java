//Given an integer n, perform the following conditional actions:
//If n is odd, print Weird
//If n is even and in the inclusive range of  to , print Not Weird
//If n is even and in the inclusive range of  to , print Weird
//If n is even and greater than , print Not Weird

public class ifElse {
    public static void mainNotMain(String[] args) {
        int n = 50;

        if(n%2 != 0){
            System.out.println("Weird");
        }
        else if(n <= 5 || n > 20){
            System.out.println("Not Weird");
        }
        else System.out.println("Weird");
    }
}
