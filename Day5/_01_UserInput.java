package Day5;

import java.util.Scanner;

public class _01_UserInput {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");

        Scanner scanner = new Scanner(System.in);   // Write terminal
        String userInput = scanner.nextLine();      // Read
        System.out.println("Your name: " + userInput);

        Scanner scanner1 = new Scanner(System.in);   // letting Java know that we'll read user input and we'll read it input
        String userInput1 = scanner1.nextLine();      // we're asking user the enter text and storing that text inside a String
        System.out.println(userInput1);

    }
}
