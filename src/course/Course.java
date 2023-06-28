package course;

import ch05.Student;

public class Course {
    private String Course; // 과목
    private String student; // 학생

    private Student[] students;
    // 상수(constance) : 초기화만 가능하고, 변경 불가능한 값
    //    private int maxStudent = 20;
    // 상수는 대문자 snake-case를 많이 사용한다.(관례, convention)
    private final int MAX_STUDENT = 20;

}
