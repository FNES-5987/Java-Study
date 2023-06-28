package ch06.map;

import java.util.*;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Map<Integer , Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Jone", 18));
        studentMap.put(2, new Student("Alice", 17));
        studentMap.put(3, new Student("Park", 21));
        studentMap.put(4, new Student("Kal", 19));
        studentMap.put(5, new Student("Spon", 18));

        Scanner scanner = new Scanner(System.in);

        System.out.println("학번 검색");
        int searchNum = scanner.nextInt();
        System.out.println("이름 : " + studentMap.get(searchNum).name + " 나이 : " + studentMap.get(searchNum).age);

        System.out.println("제거할 학생의 학번");
        int deleteNum = scanner.nextInt();
        System.out.println(deleteNum + "번 학생 " + studentMap.get(deleteNum).name + "가 명단에서 삭제 되었습니다.");
        studentMap.remove(deleteNum);

        for (Integer key : studentMap.keySet()) {
            System.out.println(studentMap.get(key).name);
        }

//        int sumAge = 0;
//        for (int i = 1; i <= studentMap.size(); i++) {
//            int sum = studentMap.get(i).age;
//            sumAge += sum;
//        }
//        int avrAge = sumAge / studentMap.size();
//        System.out.println("학생들의 나이 평균 : " + avrAge);

        int highAge = 0;
        int high = 0;
        for (Integer key : studentMap.keySet()) {
            if (studentMap.get(key).age > highAge) {
                highAge = studentMap.get(key).age;
                high = key;
            }
        }
        System.out.println("가장 나이가 많은 학생의 이름 : " + studentMap.get(high).name);

        // 문제 8: 문제 2에서 생성한 맵에 있는 학생들의 이름을 알파벳 순서로 정렬하여 출력하는 코드를 작성하세요.
        List<Student> lstStudent = new ArrayList<>(studentMap.values());
        Collections.sort(lstStudent, Comparator.comparing(Student::getName));
        for (Student s : lstStudent) {
            System.out.println(s.getName());
        }
        // 문제 9: 문제 2에서 생성한 맵에서 학생들의 이름에 특정 문자열이 포함되어 있는 경우만 출력하는 코드를 작성하세요

        System.out.println("찾으려는 학생의 이름을 입력하세요 : ");
        String searchName = scanner.nextLine();
        for (Integer key : studentMap.keySet()) {
            if (searchName.equals(studentMap.get(key).name)){
                System.out.println("이 학생의 나이는" + studentMap.get(key).age + "살 입니다.");
                break;
            } else {
                System.out.println("입력한 이름과 동일한 학생이 없습니다.");
                break;
            }
        }
    }
}
