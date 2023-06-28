package ch08.Ex_2.Tax;

public class Account implements Taxable{
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    @Override
    public double calculateTax() {
        double tax = balance / 10;
        return tax;
    }
}
