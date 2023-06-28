package ch07.override_Ex.Fruit;

public class Banana extends Fruit{
    private String bananaColor;

    public Banana(String name, String bananaColor) {
        super(name);
        this.bananaColor = bananaColor;
    }

    @Override
    public void getColor() {
        super.getColor();
        System.out.println(bananaColor + "색 입니다.");
    }
}
