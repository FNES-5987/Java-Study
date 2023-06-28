package course;

import java.util.Scanner;

public class CourseService {
    private int[][] nameList;
    private int courseMaxSize; // 최대과목개수
    private int studentMaxSize; // 최대학생수
    private Scanner scanner;

    public CourseService(int courseMaxSize, int studentMaxSize){
        nameList = new int[courseMaxSize][studentMaxSize];
        courseMaxSize = 0;
        studentMaxSize = 0;
        scanner = new Scanner(System.in);
    }

    public void addCourse(String courseName){ // 과목 추가하기
//        Course course = new course(courseName);
    }
}
