package ch08.Ex_2.Grade;

public class Student implements Gradable{
    private String  grade;
    private double credit;

    public Student(double credit) {
        this.credit = credit;
    }

    @Override
    public String calculateGrade() {
        if (credit >= 90) {
            grade = "A";
            return grade;
        } else if (credit >= 80) {
            grade = "B";
            return grade;
        } else if (credit >= 70) {
            grade = "C";
            return grade;
        } else {
            grade = "F";
            return grade;
        }
    }
}
