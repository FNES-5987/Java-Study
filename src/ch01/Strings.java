package ch01;

// 변수 사용시 대소문자 구별을 확실히 할 것.

public class Strings {
    public static void main(String[] args){
        // string = 문자열  = 문자를 여러개로 연결
        String greeting = "Hello world!";
        // 자바에서 문자열(string)은 기본 자료형이 아니다.
        // char(문자타입)을 여러개 연결한것과 같다.

        // 문자열 초기화방법
        // 문자열 값을 코드에 직접 입력한 것을 리터럴(literal)이라고 한다.
        String firstName = new String("Jo");
        String middleName = "jeong";
        String lastName = "Bin";

        // 문자열 결합방법(concat)
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 탭 등;
        String message = "Hello\nWorld"; // \n은 줄바꿈.
        System.out.println(message);

        String tapMsg = "Hello\tWorld"; // \t는 약 4칸 뛰우기.
        System.out.println(tapMsg);

        String doubleQuote = "\"Hello, World\"";
        System.out.println(doubleQuote); // \"는 "넣기.

        String back = "Hello\\World"; // \를 넣고싶다면 \\ 사용.
        System.out.println(back);

       }
}


