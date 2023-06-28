package ch06.map;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AccountManagement {
    private Scanner scanner = new Scanner(System.in);        // 사용자 키보드 입력 객체
    private Map<Integer , Account> accountMap = new HashMap<>();
    private int numAccounts = 1;

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        Account account = new Account(accountNumber, balance);
        String addAccountNum = scanner.nextLine();
        double addBlance = scanner.nextDouble();
        accountMap.put(numAccounts, new Account(addAccountNum,addBlance));
        numAccounts++;
    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        for (Integer key : accountMap.keySet()) {
            System.out.println("[계좌번호" + accountMap.get(key).getAccountNumber() + "], 잔액[" + accountMap.get(key).getBalance());
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
        Account account = findAccount(accountNumber);        // 밑의 findAccount 메서드를 가져와 현제 accountNumber 할당
        account.deposit(amount);                             // Account 클래스의 deposit 메서드 실행
    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);      // 밑의 findAccount 메서드를 가져와 현제 accountNumber 할당
        account.withdraw(amount);                          // Account 클래스의 withraw 메서드 실행
    }

    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
//        for (int i = 0; i < numAccounts; i++){
//            Account account = accountList[i];         // 배열을 Account 클래스에 저장
//            if (account.getAccountNumber().equals(accountNumber)){  // 저장된 배열에서 getAccountNumbe를 가져오고
//                                                                    // =(equals) 현제 입력된 accountNumber가 같다면
//                return account;                                     // 현제 값의 배열을 account로 반환
//            } else
//                System.out.println("해당 계좌번호는 없습니다.");
//        } return null;
//    }
        for (Integer key : accountMap.keySet()) {
            Account account = accountMap.get(accountNumber);
            if (accountMap.get(key).getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }    return null;
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
