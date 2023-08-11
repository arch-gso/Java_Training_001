package services;

import model.Student;

public class EnrollmentServiceImpl implements EnrollmentService {

    @Override
    public void computeFinalGrade(Student student) {
        if (student.getFinalGradePercent() >= 91) {
            student.setFinalGradeEquivalent(4.0);
        } else if (student.getFinalGradePercent() < 91 && student.getFinalGradePercent() >= 81) {
            student.setFinalGradeEquivalent(3.0);
        } else if (student.getFinalGradePercent() < 81 && student.getFinalGradePercent() >= 71) {
            student.setFinalGradeEquivalent(2.0);
        } else if (student.getFinalGradePercent() <= 70) {
            student.setFinalGradeEquivalent(1.0);
        }

        System.out.println("Hello student, " + student.getStudentName());
        System.out.println("Student No: " + student.getStudentNumber());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Is Graduating? " + student.isGraduating());
        System.out.println("Final Grade %: " + student.getFinalGradePercent());
        System.out.println("Final Grade: " + student.getFinalGradeEquivalent());
    }
}
