package ch02;

public class Logical {
    public static void main(String[] args) {
        // && = AND 연산자 (모두 참 일 경우에만 참)
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean result = a && b; // false
        // 단락 평가(Short-circuit Evaluation)
        // : 앞쪽 값에 의하여 판단이 가능하다면 오른족 값은 판단하지 않음.
        System.out.println(result);

        //  || = OR 연산자 (하나만 참 일 경우에도 참)
        boolean result1 = a || b; // true
        System.out.println(result1);

        boolean result2 = (a || b) && (c || b);
        System.out.println(result2);

        // ! = NOT 연산자 (결과값의 반대의 값으로 출력)
        boolean result3 = !a; // a = true 이나 NOT 연산자 때문에 false로 출력
        System.out.println(result3);
    }
}
