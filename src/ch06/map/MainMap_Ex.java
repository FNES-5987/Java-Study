package ch06.map;

import Collection_Ex.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap_Ex {
    public static void main(String[] args) {
        // 해시맵 : HashMap, 추가할 때 정렬(x), 성능이 좀 더 좋음
        // 트리맵 : TreeMap, 추가할 때 이진트리 형태로 정렬, 성능이 떨어지지만 키값으로 정렬을 해 줌
        Map<String, Student> students = new HashMap<>();

        // 객체 추가
        // 키(key) : 유일값 Ex)학번
        //값(value) : 학생정보
        // 맵변수.put(엔트리(K, V)
        students.put("01", new Student("JO", 23, 1));

        // 객체 검색/조회
        // 맵변수.keySet() -> key 목록을 반환(중복이 안됨)
        // Set : 집합, 원소의 중복이 없는 자료구조
        // 일반적으로 Map, 연관배열, dictionary, key-value pair
        // 자료구조는 정렬해서 저장하지 않음
        for (String key : students.keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println(students.get(key).getName());
        }

        // 맵변수.values() -> 값 목록을 반환함
        for (Student s : students.values()) {
            System.out.println(s.getName());
        }

        Map<String, Student> sortedStudent = new HashMap<>(students);
        for (String key : sortedStudent.keySet()) {
            System.out.println(key + students.get(key).getName());
        }

        // 해시맵을 정렬된 트리맵으로 변환해서 출력
//        Map<String key : new TreeMap<>(students).keySet();
        for (String key : new TreeMap<>(students).keySet()) {
            System.out.println(key + students.get(key).getName());
        }

        // 객체의 값 수정
        // 맵변수.get : 키 값으로 조회 후 처리 가능
        Student s = students.get("01");

        // setter 등으로 값 수정

        // 객체 삭제
        // 맵변수.remove : 특정 키 값의 엔트리(key-value)를 삭제
        students.remove("01");

        //모두 삭제
        students.clear();
    }
}
