package ch07;

// extends 부모 클래스
// = 부모 클래스의 필드 및 메서드를 상속받는다.
// inheritance(상속) : 프로그래밍 언어에서 상속은 자식이 부모를 선택해서 물려 받는다.
// SE(SW공학) -> generaliztion(일반화) -> inheritance(상속)

// 여러 개의 클래스를 구현한는데, 일반적은 속성(attribute)과 기능(operation)이 있다,
// 부모 클래스로 만들고, 나머지 클래스들은 상속받고 필요한것만 추가하자

public class Student extends Person {
    // Student는 name, age필드, introduce는 메서드를 그냥 사용 가능.
    private String studentId;

    // 비어있는 생성자는 자동으로 상속받을 수 있음
    // 하지만 매개변수가 있는 생성자는 상속할 때 별도로 선언을 해줘야함.
    public Student(String name, int age, String studentId) {
        // 부모의 생성자를 호출
        // super(...);
        // 부모 객체도 실제로 생성됨.
        super(name, age);
        this.studentId = studentId;
    }

    // 학생 연구(공부)
    // 부모의 메서드 외에 다른 메서드를 추가.
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    @Override // 재정의한다.
    public void  introduce() {
        // 기존 Person에 introduce는 그대로 쓰고
        // 다른 무언가를 추가를 하겠다.
        // super(); = 부모
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");
    }
}
