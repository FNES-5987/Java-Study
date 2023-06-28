package ch03;

public class Conditions {
    public static void main(String[] args) {
        int age = 60;
        if (age >= 60) {
            System.out.println("노인입니다.");  //if문 : ()안의 조건이 true일때 실행
            } else if (age >= 18) {
            System.out.println("성인입니다."); //else if문 : 앞의 if 또는 elseif문의 조건이 false 일 때 실행

            } else {
            System.out.println("미성년자입니다."); // else문 : if문의 조건이 false일때 실행
        }
        int dayOfWeek = 0;
        switch (dayOfWeek) {
            case 1 :
                System.out.println("토요일입니다.");
                break;
            case 2 :
                System.out.println("일요일입니다.");
                break;
            default:
                System.out.println("평일입니다.");
        }

    }
}
