package Day4.TypeCasting;

public class ExplicitCastingTask {

    public static void main(String[] args) {

        //  TASK1
        double a = 5.3;
        // int b = 5 + a
        int b = 5 + (int) a;
        System.out.println(b);


        //  TASK2
        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        // Find the exact average for students grades
        // with using slash '/' we can do vision

//        int average = (student1 + student2 + student3 + student4) / 4;
//        this is not the exact average

        double average = (student1 + student2 + student3 + student4) / 4;
        System.out.println(average);






    }
}
