package ch09;

import ch05.Student;
import ch05.Utils;
import ch07.course.Course;
import ch08.Ex_2.Bank.Account;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List : 인터페이스, ArrayList : 구현클래스
        // <String> : 매개변수를 타입(클래스)으로 넣었습니다.
        // 매개변수를 타입으로 넣을 수 있게 하는것이 제네릭.
        List<String> list = new ArrayList<>();
        // 1. 타입을 컴파일타임(코드짜는중)에 체크할 수 있다.
        list.add ("A");
//        list.add((1));    //generic을 STRING으로 넣어기에 INTERGER는 수행이 안됨.
        for (String s : list) {
            s.toUpperCase();
        }
        // List는 String, Integer, Double...
        // 기능을 타입(클래스)별로 만들지 않았어도 됨
        // 2. 코드를 타입 매개변수가지고 쉽게 재사용 가능함.
        List<Integer> lstNum = new ArrayList<>();
        lstNum.add(1);

//        Util.<Integer>
                // 오버로딩 : add(Integer A, Inteser
    }
//    Utils<타입> util) = new Utils;

    // 제네릭을 쓸 수 있는 상황 : 연산이나 로직이 똑같을때
    // 메서드명을 같은 걸 쓰고, 매개변수개수도 같은 걸 쓸때
    // 타입만 다르다.

    //모든 클래스 타입 가능한 스택 자료구조 사용
    GenericStack<String> stack = new GenericStack<>();
    GenericStack<Student> stackStudent = new GenericStack<>();
    GenericStack<Course> stackCourses = new GenericStack<>();
    GenericStack<Account> stackAccount = new GenericStack<>();

    GenericQueue<Integer> queue = new GenericQueue<>();
}
