import java.util.Scanner;
public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String a){
        int outer = 0;
        int inner = 0;
        for(int i = 0; i<a.length(); i++) {


            if (a.substring(i, i + 1).equals("(")) {
                outer++;
            }

            if (a.substring(i, i + 1).equals(")")) {
                inner++;
            }
        }
        return inner == outer;
    }

    // 2. reverseInteger
    public static String reverseInteger(int integer){
        String a = "";
        for (int i = 0; integer>0; i++) {

                int lastdigit = integer % 10;
                a += lastdigit;
                integer/=10;

        }
        return a;
    }

    // 3. encryptThis
    public static String encryptThis(String a) {
        Scanner scanner = new Scanner(a);
        String result = null;
        scanner.useDelimiter(" ");
        result = "";
        while (scanner.hasNext()) {
            String word = scanner.next();


            //char c = word.charAt(0);
            //int firstDigit = (int) word.charAt(0);
            //result = result + String.valueOf(firstDigit);
            result = result + String.valueOf((int) word.charAt(0)) +  word.substring(word.length() - 1) + word.substring(2, word.length() - 1) + word.substring(1, 2);


        }
        return result;
    }





    // 4. decipherThis
        public static String decipherThis(String a) {
            return a;
        }

}