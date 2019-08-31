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
