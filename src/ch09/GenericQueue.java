package ch09;

import java.util.LinkedList;

// 큐(Queue) : FIFO(First In First Out) 자료구조
// 가장 먼저 들어간것이 가장 먼저 처리됨.
public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // 요소 추가
    // 가장마지막 위치에 넣음.
    // ____________________
    //          ...   3 2 1
    // ____________________
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 요소 꺼내오기
    public T dequeue() {
        return queue.pollFirst();
    }
}
