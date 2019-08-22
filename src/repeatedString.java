public class repeatedString {
    public static void mainNotMain(String[] args) {
        String input = "abab";
        int n = 10;

        char[] array = input.toCharArray();
        int length = array.length;

        int numberOfA = 0;
        for (char letter : array) {
            if(String.valueOf(letter).equals("a")){
                numberOfA += 1;
            }
        }

        int tail = n % length;
        int whole = n / length;

        int allCount = whole * numberOfA;

        for (int i = 0; i< tail; i++){
            if(String.valueOf(array[i]).equals("a")){
                allCount += 1;
            }
        }

        System.out.println(allCount);
    }
}
