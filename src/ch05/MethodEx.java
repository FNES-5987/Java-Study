package ch05;

// 클래스 : 정보를 저장하고 기능을 쓸 수 있는 객체(object) 찍어내는 틀.

public class MethodEx {
    private String name;
    private int grade;

    // 매서드 : 기능(function)
    // 학생 이름(name)을 저장하는 기능.
    // CRUD (Create(창작) Read(가독) Update(갱신) Delete(삭제))
    // = 프로그램(program) 이다.
    // 메서드의 99.99%는 public 시작이다.
    // 매개변수(parameter)
    // 메서드 선언 시 :
    // 1. public 쓴다.
    // 2. 메서드(기능)의 이름을 쓴다(camel-case)
    // 3. 입력값을 받는가? / 안받는가?
    // -> 입력을 받는다. = (매개변수 선언)
    //    -> 매개변수 선언 = 이름 생각하기 -> 매개변수의 자료형
    // 4. 구현(implementation)할 코드를 작성
    // 5. 반환값이 있는가? : 메서드를 실행 하고 나서 나오는 값이 있는가?
    // -> 없음. -> 반환 타입을 메서드명 앞에 입력한다. (void, string...)

    // 학생이름을 입력받아서 저장
    public void setName(String name) {
        // 반환값이 없기 때문에 void를 사용
        this.name = name; // 객체 필드에 저장
    }

    // 학생 정보의 이름을 가져오는 메서드
    // 학생 이름은 setter로 필드에 넣어져있다 -> 필드값 반환 (return)
    // 반환값의 자료형이 문자형이다(String)
    public String getName() {
        return this.name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
