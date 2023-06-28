package ch06.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        // List<자료형> 변수형 = new ArrayList<자료형>();
        // 자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형>을 넣는다.
        // 자료형을 매개변수로 받는 것은 제네릭(generic) 이라고 한다.
        // 매개변수의 자료형은 기본(원시) 자료형(primitive type)은 안 됨
        // Ex) int, long (X), Integer, Long 클래스 타입을 넣어줘야한다.
        List<String> list = new ArrayList<String >();
//        List<String> list = new LinkedList<String>();
        List<Integer> listInt = new ArrayList<Integer>();

        // 객체 추가
        // 리스트변수.add(객체);
        list.add("조정빈");
        list.add("조민우");
        for (String name : list) {
            System.out.println(name);
        }
        // 특정 위치의 값을 변경
        // 리스트변수.set(인덱스, 객체);
        list.set(0, "조민우");
        list.set(1, "조정빈");
        for (String name : list) {
            System.out.println(name);
        }
        // 리스트변수.size() = 요소의 개수
        System.out.println(list.size());

        list.add("김종애");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println(list.size());

        // 1번 요소를 삭제 뒤에있는 내용을 모두 당여옴, 구명(NULL)이 없음.
        // 리스트변수.remove(인덱스);
        list.remove(1);
        for (String name : list) {
            System.out.println(name);
        }

        // 2번에 객체 삽입
        list.add(0,new String("최현지"));
        for (String name : list) {
            System.out.println(name);
        }
        // 이렇게 중간에 요소를 추가하거나 삭제하게 되면,
        // 뒤쪽 요소를 밀거나 당겨야하는 overhead(추가연산)이(가) 발생
        // 이런 케이스가 잦다면, ArrayList -> LinkedList 로 변경해야한다.
        // 하지만 처리 속도가 더딜 수 있다.
        // 처리속도      요소추가,    전체 탐색,   요소삭제/삽입
        // ArrayList    빠름        빠름        느림(많이)
        // LinkesList   느림        느림        빠름
    }
}