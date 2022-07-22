package Day3.PrimitiveTypes;

public class ByteDataType {
    public static void main(String[] args) {

        //int age = 30; - we don't have to use int for the storage
        byte age = 30; // byte is takes up less space in memory

        byte myFirstByte = 77;
        byte mySecondByte = -21;

        System.out.println(myFirstByte);
        System.out.println(mySecondByte);

        byte maxValue = 127; // byte values are between 127 and -128. we can't give numbers more than this two numbers
        byte minValue = -128;

        System.out.println(myFirstByte);
        System.out.println(mySecondByte);



    }
}