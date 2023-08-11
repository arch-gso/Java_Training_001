package app;

import model.Student;
import services.EnrollmentService;
import services.EnrollmentServiceImpl;

public class MainV2 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Jose Rizal");
        student.setStudentNumber("ABC1234");
        student.setCourse("BS-CS");
        student.setGraduating(false);
        student.setFinalGradePercent(89.0f);

        EnrollmentServiceImpl enrollmentService = new EnrollmentServiceImpl();
        enrollmentService.computeFinalGrade(student);
    }
}
