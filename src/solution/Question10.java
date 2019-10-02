package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question10 {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("char ch = ");
        String ch = scanner.next();
        System.out.printf("String inputString = ");
        String inputString = scanner.next();

        System.out.println(inputString.indexOf(ch));
    }
}
