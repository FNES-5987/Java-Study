package ch02;

public class Increase {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;

        // 전행연산 = 먼저 변경된 값을 적용
        System.out.println(a++);
        System.out.println(a);
        System.out.println("--------");
        // 후행연산 = 현재 처리 후 변경된 값이 적용
        System.out.println(++b);
        System.out.println(b);
        // 세미컬런으로 끝나는 1개의 단위를 구문, 식(expression)이라고 한다.
        System.out.println("-------");
        int c = 5;
        int d = 7;
        System.out.println(--c);
        System.out.println(c);
        System.out.println("-------");
        System.out.println(d--);
        System.out.println(d);

        System.out.println("-------");
        int e = 3;
        int f = 4;
        int g = ++e * f--;
        System.out.println(g);
    }
}
