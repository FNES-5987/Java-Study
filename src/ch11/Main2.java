package ch11;

public class Main2 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}