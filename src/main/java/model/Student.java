package model;

public class Student {

    private String studentName;
    private String studentNumber;
    private String course;
    private int year;
    private boolean isGraduating;
    private float finalGradePercent;
    private double finalGradeEquivalent;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isGraduating() {
        return isGraduating;
    }

    public void setGraduating(boolean graduating) {
        isGraduating = graduating;
    }

    public float getFinalGradePercent() {
        return finalGradePercent;
    }

    public void setFinalGradePercent(float finalGradePercent) {
        this.finalGradePercent = finalGradePercent;
    }

    public double getFinalGradeEquivalent() {
        return finalGradeEquivalent;
    }

    public void setFinalGradeEquivalent(double finalGradeEquivalent) {
        this.finalGradeEquivalent = finalGradeEquivalent;
    }
}
