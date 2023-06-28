package ch05.stsatics;

public class Main2 {
    public static void main(String[] args) {
        int result1 = Counter.getCount();   // ++
        System.out.println(result1);    // count == 0

        int result2 = Counter.getCount();   // ++
        System.out.println(result2);    // count == 1
    }
}
