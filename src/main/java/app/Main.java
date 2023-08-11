package app;

public class Main {
    //Red Line means error
    public static void main(String[] args) {

        String studentName = "Jose Rizal";
        String studentNumber = "ABC1234";
        String course = "BS-CS";
        int year = 4;
        boolean isGraduating = false;


        float finalGradePercent = 89;
        double finalGradeEquivalent = 0;

        if (finalGradePercent >= 91) {
            finalGradeEquivalent = 4.0;
        } else if (finalGradePercent < 91 && finalGradePercent >= 81) {
            finalGradeEquivalent = 3.0;
        } else if (finalGradePercent < 81 && finalGradePercent >= 71) {
            finalGradeEquivalent = 2.0;
        } else if (finalGradePercent <= 70) {
            finalGradeEquivalent = 1.0;
        }

        System.out.println("Hello student, " + studentName);
        System.out.println("Student No: " + studentNumber);
        System.out.println("Course: " + course);
        System.out.println("Is Graduating? " + isGraduating);
        System.out.println("Final Grade %: " + finalGradePercent);
        System.out.println("Final Grade: " + finalGradeEquivalent);


    }
}
