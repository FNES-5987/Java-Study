package Collection_Ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //문제 1: Student 클래스가 있다고 가정하고, 다음과 같은 필드를 가지고 있다: name, age, grade.
        //Student 객체들로 이루어진 List를 생성하고, 5명의 학생 정보를 추가해보세요.
        List<Student> studentList = new ArrayList<>();

        studentList.add(0,new Student("Jone",8,1));
        studentList.add(1,new Student("Alice", 9, 2));
        studentList.add(2,new Student("Kal", 10, 3));
        studentList.add(3,new Student("Park", 11, 4));
        studentList.add(4,new Student("Choi", 12, 5));

        //문제 2: 문제 1에서 생성한 List에서, 이름이 "John"인 학생들만 출력하세요.
        boolean searchJone = studentList.contains("Jone");
        if (searchJone) {
            System.out.println();
        } else {
            System.out.println("리스트에 Jone이 없습니다.");
        }
        System.out.println("___________________");

        //문제 3: 문제 1의 List에서, 10학년(grade 10) 이상인 학생들의 이름을 출력하세요.
        List<Student> ageList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getAge() >= 10) {
                ageList.add(student);
            }
        }
        for (Student student : ageList) {
            System.out.println(student.getName());
        }
        System.out.println("_____________________");

        //문제 4: Student 객체들로 이루어진 빈 List를 생성하고,
        //사용자로부터 3명의 학생 정보(이름, 나이, 학년)를 입력받아 리스트에 추가하세요.
    }
}
