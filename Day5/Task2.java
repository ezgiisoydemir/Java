package Day5;

import java.util.Scanner;

public class Task2 {

    //  Get 2 integer from user | Sum this 2 numbers and print the total

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1:");
        int userNumber1 = scanner.nextInt();

        System.out.println("Number 2:");
        int userNumber2 = scanner.nextInt();

        System.out.println("Total: " + (userNumber1+userNumber2));
    }
}
