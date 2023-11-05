public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String a){

        for(int i = 0; i<a.length()-2; i++){
            char one = a.charAt(i);
            char two = a.charAt(a.length()-i);

            if(one!=two){
                return true;
            }
        }
        return false;
    }

    // 2. reverseInteger
    public static String reverseInteger(int integer){
        int a = 0;
        for (int i = 0; i<integer; i++) {
            int lastdigit = 0;
            if (integer > 9) {
                lastdigit = integer % 10;
                a = (a * 10) + lastdigit;
                integer = (integer - lastdigit) / 10;

            } else
                a = a + lastdigit;


        }
        String b = Integer.toString(a);
        return b;
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