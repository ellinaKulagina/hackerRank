import java.util.Scanner;

public class jumpingClouds {
    public static void mainNotMain(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] clouds = new int[n];
        for(int i=0; i<n; i++)
        {
            clouds[i] = in.nextInt();
        }
        int j = 0;
        for (int i=1;i<n;i++){
            if(i<n-1 && clouds[i+1]==0){
                j++;
                i++;
            }
            else j++;
        }
        System.out.println(j);
    }
}
