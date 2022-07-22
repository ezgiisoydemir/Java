package Day9;

public class _04_Division {

    public static void main(String[] args) {

        // Division only using values
        // 9 and 2 are integer -> result will be integer = 4 not 4.5
        System.out.println(9 / 2);

        // if we use double in question answer will be double either -> answer = 4.5
        System.out.println(9 / 2.0);

        // Division using only variables
        int x = 45;
        int y = 5;

        System.out.println(x / y);

        int result = x / 9;
        System.out.println(result);

        // System.out.println(15 / 0); - not possible, you cannot divide by 0

        int a = 25;
        int b = 4;

        double result2 = (double) a / (double) b;
        System.out.println(result2);

    }

}
