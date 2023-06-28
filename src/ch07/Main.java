package ch07;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("조정빈", 23);
        person.introduce();

        Person p2 = person;
        p2.work();
        p2.introduce();
        Person p3 = new Student("조민우", 20, "");
        p3.work();

        //부모객체를 자식 각체에 대입
        //명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재
        //부모객체변수 instanceof() 자식클래스타입
        // Student -> Person, Person, Lectures -> Person 확인 필요
        if (p2 instanceof Student) {
            Student s2 = (Student) p2;
            s2.study();
        }

        if (p3 instanceof Student) {
            Student s3 = (Student) p3;
            s3.study();
        }
    }
}
