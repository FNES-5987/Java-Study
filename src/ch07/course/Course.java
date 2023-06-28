package ch07.course;

public class Course {
    String courseName;  //과목 이름
    int courseCode; //과목 코드
    String instructor;  //강사 이름

    public String getCourseName() {
        return courseName;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public String getInstructor() {
        return instructor;
    }

//    List<Course> courses = new ArrayList<>();
//    addCourse(new onlineCourse(""));
//    addCourse(new LectureCourse(""));
//
//    addCourse(Course course) {
//        courses.add(course);
//    }
//
//    addCourse(..., String platform) {
//        courses.add(new onlineCourse());
//        courses.add(new LectureCourse());
//    }
}
