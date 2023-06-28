package ch05;

public class Student {
    private String name;
    private int grade;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
    int getAge(){
        return age;
    }

    public void printStudentInfo() {
        System.out.println("이름 : " + name + " 학년 : " + grade + " 나이 : " + age);
    }

    public void upGrade() {grade++;}
}
