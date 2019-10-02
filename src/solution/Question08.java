package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question08 {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter String Value : ");
        String stringInput = scanner.nextLine();

        int upperCasrWeight = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z'){
                upperCasrWeight += (int) stringInput.charAt(i);
            }
        }

        System.out.println("UpperCaseWeight of input String :" + upperCasrWeight);
        scanner.close();
    }
}