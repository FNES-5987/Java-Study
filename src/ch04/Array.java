package ch04;

public class Array {
    public static void main(String[] args) {
        // 배열(Array) = 동일한 타입의 여러 개의 값을 저장하는 자료구조이다.
        // 타입[] 배열이름 = new 타입[크기];
        // 배열 초기화 방법
        int[] numbers = new int[5]; // 크기가 [5]인 배열 생성
        // 컴퓨터 언어는 0부터 시작이기에 0~4까지의 배열을 생성한다.

        // 각 배열 요소(element)에 값을 할당
        // 배열이름[번호(index)] = 값;
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers[0]);

        // 배열의 크기
        // 배열이름.length;
        int arrayLength = numbers.length;
        System.out.println(arrayLength);

        // 배열을 반복문으로 접근하는 방법
        // 0에서 시작해서 배열의 길이보다 작을 때 까지
        // 배열의 크기가 5인 배열에서는 0, 1, 2, 3, 4 이기에 작아야한다
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 배열 요소에 초기값을 넣어서 초기화 하는 방법
        int[] numbers2 = {5, 10, 15};
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers2[j]);
        }

        // 배열의 크기를 나중에 정하기
        int[] numbers3;
        // ...~
        // 배열 크기가 초기화 되기 전에 참조를 하면 에러
//        System.out.println(numbers3[0]);

        numbers3 = new int[3];
        System.out.println(numbers3[0]);
    }
}
