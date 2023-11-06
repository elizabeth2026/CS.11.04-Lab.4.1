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
        String answer = "";
        for(int i = 0; i<a.length(); i++){

            String letterone = a.substring(0,1);
            int front = Integer.parseInt(letterone);
            String middle = a.substring(1,2);
            String lastletter = a.substring(a.length()-1);
            String font = Integer.toString(front);
            answer = font + lastletter + middle;
        }
        return answer;
    }

    // 4. decipherThis
        public static boolean decipherThis(String a) {
            return true;
        }

}