package ch06.set;

import ch06.map.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("조",23);
        Student s2 = new Student("최", 25);
        Student s3 = s1;
        Student s4 = new Student("최", 25);

        // 같은참조면 같은 값이 나온다.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        // equals는 기본적으로 같은참조면 ture이다.
        System.out.println(s1.equals(s3));

        // 객체추가
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");

        // 객체 탐색/조회
        for (String s : sets) {
            System.out.println(s);
        }

        // contains
        // 해당 값이 있나 없나 확인
        System.out.println(sets.contains("cherry"));

        // 삭제
        sets.remove("cherry");

        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("banana");
        lst.add("durian");
        lst.add("elderberry");
        lst.add("durian");

        for (String s  : lst) {
            System.out.println(s);
        }

        // 컬렉션(리스트) -> set으로 초기화 생성
        // 중복제거, TreeSet으로 중복제거에 정렬까지
        Set<String> set2 = new TreeSet<>();
        for (String s : new TreeSet<>(lst)) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~");
    }
}
