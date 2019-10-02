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
        for (int i = 0; i < lengthOfString ; i++) {
            totalWeight = totalWeight + (int) stringInput.charAt(i);

        }
        System.out.println("TotalWeight String : "+ totalWeight);

    }
}
