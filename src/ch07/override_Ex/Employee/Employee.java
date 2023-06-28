package ch07.override_Ex.Employee;

public class Employee {
    // 문제 3: Employee라는 클래스를 만들고, calculateSalary라는 메서드를 추가해주세요.
    // FullTimeEmployee와 PartTimeEmployee라는 두 개의 하위 클래스를 만들고, calculateSalary 메서드를 오버라이드해 각각 다른 연봉 계산식을 사용하도록 해주세요.
    String salary;

    public Employee(String salary) {
        this.salary = salary;
    }

    public void pay() {
        System.out.println(salary + " 정보를 알려드리겠습니다.");
    }
}
