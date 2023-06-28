package ch02;

public class Arithmetic
{
    public static void main(String[] args) {
        // arithmetic(산술) operation(연산)
        // 사칙 +-*/
        // 컴퓨터 공학에서의 수학 : 이산수학(dicrete mathmatic), 선형대수학(linear algebra)
        // 이산수학 : 수열, 순열, 조합, 경우의 수
        // 선형대수학 : 행렬, 벡터

        // 대입연산 = 할당, 대입, assignment

        int a = 5;
        int b = 10;

        // 더하기 +
        int sum = a + b;
        System.out.println(sum);

        // 빼기 -
        int difference = b - a;
        System.out.println(difference);

        // 곱하기 *
        int product = a * b;
        System.out.println(product);

        //나누기 /
        int quotient = b / a;
        System.out.println(quotient);

        // 나머지 %
        int remainder = b % a;
        System.out.println(remainder);
    }
}
