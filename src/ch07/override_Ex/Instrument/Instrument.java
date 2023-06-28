package ch07.override_Ex.Instrument;

public class Instrument {
    // 문제 1 : Instrument 클래스를 만들고 play라는 메서드를 추가해주세요.
    // Guitar과 Piano라는 두 개의 하위 클래스를 만들고, play 메서드를 오버라이드해 각각 다른 출력을 반환하도록 해주세요.
    String name;
    String sound;

    public Instrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " 악기를 연주합니다.");
    }
}
