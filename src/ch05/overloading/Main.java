package ch05.overloading;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        int resultInt = operator.multiply(4, 5);
        double resultDouble = operator.multiply(4.1, 5.1);
        int[] arr = {1,2,3,4,5,6,7};
        int result = operator.multiply(arr);
        System.out.println(result);
        }
    }
