package Day6.StringMethods;

public class _02_EndsWith {

    public static void main(String[] args) {

        //  Reference Data Type starts with capital letter
        //  methods start with lower case letter

        String message = "Hello World";

        boolean isMessageEndsWithWorldUpper = message.endsWith("World!");

        System.out.println(isMessageEndsWithWorldUpper);

        boolean isMessageEndsWithWorldLower = message.endsWith("world!");

        System.out.println(isMessageEndsWithWorldLower);



    }
}
