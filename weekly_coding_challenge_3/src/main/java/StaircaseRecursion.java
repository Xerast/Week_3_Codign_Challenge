import java.util.ArrayList;

public class StaircaseRecursion {


    public static void main(String[] args) {

        System.out.println(checker(0));// 1
        System.out.println(checker(1));// 1
        System.out.println(checker(2));// 2
        System.out.println(checker(3));// 3
        System.out.println(checker(4));// 5
        System.out.println(checker(5));// 8
        System.out.println(checker(6));// 13
        System.out.println(checker(7));// 21

    }

    public static int checker(int number) {
        ArrayList<Integer> sequence = new ArrayList<Integer>();
            sequence.add(1);
            sequence.add(1);
            sequence.add(2);
        for (int i = 2; i < number; i++){
            int placeHolder = sequence.get((i-1)) + sequence.get((i));
            sequence.add(placeHolder);

        }
        return sequence.get(number);
        }
}

