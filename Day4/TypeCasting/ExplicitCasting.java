package Day4.TypeCasting;

public class ExplicitCasting {

    // Explicit Casting - Narrow Casting (Manuel)

    public static void main(String[] args) {

        long myLong = 284563L;
        int myInteger = (int) myLong;
        System.out.println(myInteger);

        int myInteger2 = 5000;
        short myShort = (short) myInteger2;
        System.out.println(myShort);

        short myShort2 = 54;
        byte myByte = (byte)myShort2;
        System.out.println(myByte);

        double myDouble = 3.123;
        float myFloat = (float) myDouble;
        System.out.println(myFloat);

        double myDouble2 = 45.45;
        int myInteger3 = (int) myDouble2;
        System.out.println(myInteger3);

    }

}
