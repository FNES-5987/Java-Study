package ch08;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가능하다.
        // Shape s = new Shape();
        // 구현체로만 객체 생성이 가능하다.
//        Shape s = new Circle(5);
//        System.out.println(s.calculateArea());
//        System.out.println(s.calculatePerimeter());

        // 회사 경영진이 "야, 원 말고 사각형으로 바꿔!" 라고 해서
        // 사각형으로 바꿉니다 ㅠㅠ
        Shape s = new Rectangle(10,10);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
    }

    // 인터페이스를 쓰는 1번째 이유로는 갈아끼우기가 쉽다.
    // 2번재는 클래스들의 기본 스펙(기능)을 정의한다.
}
