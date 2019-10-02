package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question06 {
    public static void main(String[] artgs){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter String Value : ");
        String stringInput = scanner.nextLine();

        stringInput = stringInput.toLowerCase();
        System.out.println("Lowered Case : " + stringInput);

    }
}

