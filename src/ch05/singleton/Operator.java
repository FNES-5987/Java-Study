package ch05.singleton;

public class Operator {
    // private static 클래스 객체
    private static Operator instance;  // NULL값으로 초기화가 되어있음

    // 외부에서 객체 생성이 안 됨.
    // private 생성자
    private Operator() {
        // private 생성자
    }

//    public Singleton(Singleton instance) {
//        this.instance = instance;
//    }     // 이 또한 오버로딩 방법이다.

    // getInstance 메서드로 처음에 생성한 객체만 접근하게 하는 방법
    // 객체 생성은 첫번째 메서드 호출시에 1번만.
    public static Operator getInstance() {
        if (instance == null) {
            instance = new Operator();
            System.out.println("객체가 생성되었습니다.");
        }
        return instance;
    }

    public int multiply(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int mulResult = 1;
        for (int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }
    public int multiply(double x, double y, int z) {
        System.out.println("double, double, int");
        return (int) (x * y) * z;
    }
    int multiply(int x, int y) {
        System.out.println("int, int");
        return x * y;
    }
}
