package ch01;

import javax.sound.midi.Soundbank;

public class Casting {
    public static void main(String[] args){
        // 형변환(형식 변환, Casting, Conversion)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        // 1. 묵시적 형변환(자동 형변환)
        // 잘 안씀
        int x = 10;
        double y = x;
        System.out.println(y);

        //명시적 형변환(강제 형변환, explicit conversion)
        double a = 10.5;
        int b = (int) a;
        System.out.println(b);

        //완성형 코드를 저장한다.
        char c = '힝';
        int d = c;
        System.out.println(d);

        //문자 <- 숫자
        int num = 5987;
        String str = Integer.toString(num);
        System.out.println(str);

        // String.ValueOf(데이터값)
        String strValue = String.valueOf(num);
        System.out.println(strValue);

        // 소숫점이 있는 10진수 = decimal
        double decimal = 10.7;
        String strDecimal = Double.toString(decimal);
        System.out.println(strDecimal);

        String strDecimalValue = String.valueOf(decimal);
        System.out.println(strDecimalValue);

        // 문자 -> 숫자
        String number = "50";
        int intnum = Integer.valueOf(number);
        int intnum1 = Integer.parseInt(number);
        System.out.println(intnum);
        System.out.println(intnum + intnum1);
        double intnum2 = Double.valueOf(number);
        System.out.println(intnum2);
    }
}
