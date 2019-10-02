package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        int lengthOfString = stringInput.length();
        int totalWeight = 0;
        System.out.printf("totalWeight = ");

        for (int i = 0; i < lengthOfString ; i++) {
            int weightOfChar = (int) stringInput.charAt(i);
            totalWeight = totalWeight + weightOfChar;
            System.out.print( weightOfChar + " + ");
        }
        System.out.println("\b\b \n \t \t  = "+ totalWeight);

    }
}
