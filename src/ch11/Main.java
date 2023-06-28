package ch11;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10;
            int desult = 1;
            int div = result / desult;
        } catch (ArithmeticException e) { // 특정 예외 상황
            System.out.println("예외 발생 : " + e.getMessage());
            System.out.println("정확히 입력해주세요");

        } catch (Exception e) { // 일반적인 예외 상황
            System.out.println(e.getMessage());
        }
    }
}
