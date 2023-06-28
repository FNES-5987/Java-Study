package ch07.override_Ex.Fruit;

public class Fruit {
    // 문제 2: Fruit 클래스를 만들고, 이 클래스는 getColor라는 메서드를 포함하게 해주세요.
    // 그 다음 Apple과 Banana라는 두 개의 하위 클래스를 만들고, 각각 getColor 메서드를 오버라이드해 각각의 과일 색상을 반환하도록 해주세요.
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void getColor() {
        System.out.println(name + "의 색상을 알려드립니다.");
    }
}
