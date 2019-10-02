package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */


public class Question05 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Any String Value : ");
        String stringInput = scanner.nextLine();
        System.out.printf("Enter Value of subString : ");
        String subStringInput = scanner.nextLine();
        System.out.printf("Enter the  Value to be Replaced with   : ");
        String subStringInputForReplacement = scanner.nextLine();

        String newStringFormed = stringInput.replace(subStringInput,subStringInputForReplacement);
        System.out.println("New String : " + newStringFormed);


    }
}
