package ch06.list.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement {
    private List<Account> accountList;  // 계좌 목록 리스트
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        // ArrayList로 변경하기
        accountList = new ArrayList<>();
        scanner = new Scanner(System.in);   // 사용자 입력 객체 생성
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        accountList.add(new Account(accountNumber, balance));
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후
        //class Student { 배열의 앞에서부터 빈 공간의 마지막에 추가한다.
    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
            for (Account account : accountList) {
                System.out.println("계좌번호: [" + account.getAccountNumber() + "], " +
                        "잔액: [" + account.getBalance() + "]");
            }
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------
    }

    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 입금 금액 만큼 잔액을 증가한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount){
            // **코드 작성
            // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
            // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);      // 밑의 findAccount 메서드를 가져와 현제 accountNumber 할당
        account.withdraw(amount);                          // Account 클래스의 withraw 메서드 실행
    }

    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        for (Account account : accountList) {   // accountList 반복
            if (account.getAccountNumber().equals(accountNumber)) {     // 입력받은 계좌번호가 목록의 계좌번호와 같다면
                return account;     // 리스트로 반환
            }
        }
        return null;
    }

    public void run() {
        while (true) {
            // 메뉴 기능 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            // 메뉴 번호 받기
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
