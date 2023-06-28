package ch08;

public class Test {


    static void testArea(Shape s) {
            // 기능 1 : 너비 구하기 테스트
            double expectedResult = 100;
            double actualResult = s.calculateArea();

            if (actualResult == expectedResult) {
                System.out.println("1. 너비 구하기 성공!");
            } else {
                System.out.println("1. 너비 구하기 실패ㅠㅠ");
            }
        }
    static void testPerimeter(Shape s) {
        // 기능 2 : 둘레 구하기 테스트
        double expectedResult = 40;
        double actualResult = s.calculatePerimeter();

        if (actualResult == expectedResult) {
            System.out.println("2. 둘레 구하기 성공!");
        } else {
            System.out.println("2. 둘레 구하기 실패ㅠㅠ");
        }
    }

    public static void main(String[] args) {
        Shape s = new Square();
    }
}
