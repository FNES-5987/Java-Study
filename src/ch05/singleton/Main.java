package ch05.singleton;

public class Main {
    public static void main(String[] args) {
        // 생성자가 private라 불가능.
//        Singleton s1 = new Singleton();

        // getInstance 메서드로 생성
        Operator s1 = Operator.getInstance(); // 첫번째 객체 생성
//        s1.hashCode(); // 객체의 유일성을 가진 코드값.
        Operator s2 = Operator.getInstance(); // 이전에 생성된 객체 반환
        Operator s3 = Operator.getInstance(); // 이전에 생성된 객체 반환
        System.out.println(s1); //Singleton@10f87f48
        System.out.println(s2); //Singleton@10f87f48
        System.out.println(s3); //Singleton@10f87f48
        int[] arr = {1,2,3,4,5};
        s1.multiply(arr);

        Test1 t1 = new Test1();
        t1.test();

        Test2 t2 = new Test2();
        t2.test();
    }
}
