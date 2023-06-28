package ch07.override_Ex.Employee;

public class PartTimeEmployee extends Employee{

    private int hourlyWage = 9620;
    private int workingHours = 40;
    private int weeklyPay = hourlyWage * workingHours;

    public PartTimeEmployee(String salary, int weeklyPay) {
        super(salary);
        this.weeklyPay = weeklyPay;
    }

    @Override
    public void pay() {
        super.pay();
        System.out.println(weeklyPay + "원 입니다.");
    }
}
