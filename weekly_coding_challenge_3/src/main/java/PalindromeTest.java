public class PalindromeTest {

    public static void main(String[] args) {


        System.out.println(checker("abcdcbg"));
        System.out.println(checker("abccia"));
        System.out.println(checker("abcdaaa"));
        System.out.println(checker("1234312"));
        System.out.println(checker("12343162"));
        System.out.println(checker("abcdefgfedcba"));

    }

    public static boolean checker(String str) {
        int n = str.length();
        int counter = 0;
        boolean result = false;
        System.out.println(str);

        int l;
        if (n % 2 == 0) {

            l = n / 2;
            n = n - 1;
            for (int i = 0; i < l; i++) {
                char a = str.charAt(i);
                char b = str.charAt(n--);
                if (a == b) {
                    counter++;
                }
            }



        }
        else{
            l = n - n / 2;

            n = n - 1;

            for (int i = 0; i < l; i++) {
                char a = str.charAt(i);
                char b = str.charAt(n--);
                if (a == b) {
                    counter++;
                }
            }


        }
        if ((counter == l - 1) || (counter == (l))) {
            result = true;
        }

        return result;
    }
}
