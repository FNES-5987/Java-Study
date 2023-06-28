package ch08.Ex_2.Tax;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account.calculateTax());
    }
}
