package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question11 {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("char ch = ");
        String ch = scanner.next();
        System.out.printf("String inputString = ");
        String inputString = scanner.next();

        for (int i = 0; i <inputString.length() ; i++){
             if (inputString.charAt(i) == ch.charAt(0)){
                 System.out.println(i);
             }
        }
    }
}
