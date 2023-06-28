package ch06.map;

import account.AccountManagement;

public class Main {
    public static void main(String[] args) {
        account.AccountManagement accountManagement = new AccountManagement(100);
        accountManagement.run();

    }
}
