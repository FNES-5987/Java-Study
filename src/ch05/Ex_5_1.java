package ch05;

// default
class TestClass {
    // 접근제한 : 패키지범위
    void perfomTest() {

    }
}

public class Ex_5_1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jone");
        student.setGrade(10);
        student.printStudentInfo();

        Student student1 = new Student();
        student1.setName("Lisa");
        student1.setGrade(11);
        student1.upGrade();
        student1.setAge(16);
        student1.printStudentInfo();
    }

    public void test() {
        // protected 메서드는 다른 패키지에서 사용을 못함
        // animal.eat();
    }
}
