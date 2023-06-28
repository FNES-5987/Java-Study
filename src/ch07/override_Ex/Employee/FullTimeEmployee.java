package ch07.override_Ex.Employee;

public class FullTimeEmployee extends Employee{
    private int annualIncome = 28000000;
    private int mountlyPay = annualIncome / 12;

    public FullTimeEmployee(String salary, int mountlyPay) {
        super(salary);
        this.mountlyPay = mountlyPay;
    }
    @Override
    public void pay() {
        super.pay();
        System.out.println(mountlyPay + "원 입니다.");
    }
}
