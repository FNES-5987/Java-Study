package ch05.accessModifier;

// 차량 정보
public class Car {
    // 다른 클래스에서는 메서드로만 접근
    // public 메서드
    // public메서드는 어느 클래스에서도 접근 가능하다
    public void startEngine() {
        System.out.println("Engine started!");
        BankAccount bankAccount = new BankAccount();
        // private메서드는 다른 클래스에서 접근 불가능.
        // account.deductFunds
    }
}
