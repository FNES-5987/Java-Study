package ch07.course;

import java.util.ArrayList;
import java.util.List;

public class courseManager {
    private Course[] courses; // 코스 배열 만들기
    private int count;  // 숫자 카운터 만들기

    public courseManager(int capacity) {    //배열 초기화
        courses = new Course[capacity];
        count = 0;
    }

    public void addCourse(Course course) {
        if (count < courses.length) {   // 저장된 용량까지 반복
            courses[count] = course;    // course값을 해당 배열 번호에 저장
            count++;                    // 숫자 카운터 +1
        } else {
            System.out.println("용량이 가득 찼습니다.");  // 카운터가 저장값 최대치보다 높다면 가득찼다고 표시
        }
    }

    public void printCourses() {
        for (int i = 0; i < count; i++) {
            Course course = courses[i];         // 모든 배열 검색
            System.out.println("강의 이름: " + course.getCourseName());
            System.out.println("강의 번호: " + course.getCourseCode());
            System.out.println("강사 이름: " + course.getInstructor());

            if (course instanceof onlineCourse) {       // 만약 온라인 코스와 대치한다면 코스플랫폼을 출력
                onlineCourse onlineCourse = (onlineCourse) course;
                System.out.println("플렛폼: " + onlineCourse.getPlatform());
            } else if (course instanceof LectureCourse) {       // 만약 강의 과정과 겹친다면 강의실과 시간을 출력
                LectureCourse lectureCourse = (LectureCourse) course;
                System.out.println("강의실: " + lectureCourse.getRoom());
                System.out.println("시간: " + lectureCourse.getTime());
            }

            System.out.println();
        }
    }

    public void getCourseByInstructor() {
        List<String> courseList = new ArrayList<>();// ArrayList 만들기

        for (Course course : courses) {  // 모든 강의 내용을 검색
            if (course.getInstructor().equals(course.instructor)) {
                courseList.add(course.getCourseName());  // 특정 강사와 매치되는 강의들만 리스트 배열에 입력
            }
            System.out.println(courseList);     // 입력된 배열 값들 모두 출력
        }
    }

    public Course getOnlineCourses() {    //OnlineCourse 객체들을 배열로 반환하는 메서드
        List<String> onlineList = new ArrayList<>();
        for (Course course : courses) {
            if (course instanceof onlineCourse) {
                return course;
            }
        }
        return null;
    }

    public Course getLectureCourses() {   //LectureCourse 객체들을 배열로 반환하는 메서드
        for (Course course : courses) {
            if (course instanceof LectureCourse) {
                return course;
            }

        }
        return null;
    }
}