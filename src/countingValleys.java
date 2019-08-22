public class countingValleys {
    public static int count(int n, String s){
        int altitude = 0;
        int valleys = 0;

        for(int i = 0; i<n; i++){
            char step = s.charAt(i);
            if(step == 'U'){
                altitude++;
                if(altitude == 0){
                    valleys++;
                }
            }
            else altitude--;
        }

        return valleys;
    }
}
