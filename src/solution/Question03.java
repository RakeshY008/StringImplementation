package solution;

/**
 * @ Author : Rakesh Yadav
 */

import java.util.Scanner;
public class Question03 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();
        inputString = inputString.replace('a','*');
        inputString = inputString.replace('e','*');
        inputString = inputString.replace('i','*');
        inputString = inputString.replace('o','*');
        inputString = inputString.replace('u','*');

        System.out.println(inputString);
    }
}
