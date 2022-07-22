package Day3.PrimitiveTypes;

import com.sun.security.jgss.GSSUtil;

public class Task {
    //              Task
    // Create variables for all Primitive Data Types with meaningful names

    public static void main(String[] args) {

        byte magapixel = 12;
        short yearPandemicStarted = 2020;
        int accountNumber = 44345643;
        long vinNumber = 123_456_765_487_456L;

        System.out.println(magapixel);
        System.out.println(yearPandemicStarted);
        System.out.println(accountNumber);
        System.out.println(vinNumber);

        float bodyWeight = 72.45F;
        double speed = 120.3456;
        char firstLetterOfAlphabet = 'A';
        boolean isCameraOn = true;

        System.out.println(bodyWeight);
        System.out.println(speed);
        System.out.println(firstLetterOfAlphabet);
        System.out.println(isCameraOn);

        // difference between float and double
        float number = 1234.6543221F;
        System.out.println(number);     // answer = 1234.6543

        double numbers = 1234.65432242421;
        System.out.println(numbers);    // answer = 1234.65432242421
    }
}
