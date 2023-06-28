package ch09;

// LinkedList를 이용하여 스택이라는 자료구조를 만들 것임.
// 스택은 LIFO(Last In First Out)구조로 되어있다.
// 가장 나중에 넣은 것이 가장먼저 처리되는 형태의 자료구조이다.

// 예시) 메서드 호출이 스택에 쌓아놓고 실행된다.
// a() -> b() -> c() : 실행순서 = c() -> b() -> a()

import java.util.LinkedList;

// 예시) 웹 브라우저 뒤로가기 : 가장 나중에 열린 페이지부터 뒤로 가기를 실행합니다.
// NavigationStack : 1 -> 2 -> 3... 뒤로가기시 3 -> 2 -> 1
public class GenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    // 요소 추가
    public void push(T item) {
//        stack.addFirst(item);
        stack.addLast(item);
    }

    public T pop() {
//        return stack.removeFirst();
        return stack.removeLast();
    }
}
