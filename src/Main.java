public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String a){

            int half = a.length()/2;
            if(a.substring(half,half+2).equals("()")){
                return true;
        }
            return false;
    }

    // 2. reverseInteger
    public static String reverseInteger(int integer){
        int a = 0;
        for (int i = 0; i<integer; i++) {
            int lastdigit = integer%10;
            a = (a*10)+lastdigit;
            if(integer>=1 && integer<9) {
                a=a+lastdigit;
            }
            else

                integer = (integer - lastdigit) / 10;




        }

        String b = Integer.toString(a);
        return b;
    }

    // 3. encryptThis
    public static boolean encryptThis(String a) {
        return true;
    }

    // 4. decipherThis
        public static boolean decipherThis(String a) {
            return true;
        }

}