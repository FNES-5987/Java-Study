package ch05.accessModifier;

public class BankAccount {
    private int balance;  // private 멤버 변수

    // private 메서드
    // class 만든 사람만 쓰려고 만든것.
    private void deductFunds(int amount) {
        if (amount <= balance) {
            balance -= amount;
            // Deducted = 차감하다
            System.out.println("Funds deducted: " + amount);
        } else {
            // Insufficient = 불충분한
            System.out.println("Insufficient funds!");
        }

        Animal animal = new Animal(); // protected 메서드
        animal.eat();
    }
}
