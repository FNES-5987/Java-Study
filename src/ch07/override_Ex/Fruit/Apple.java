package ch07.override_Ex.Fruit;

public class Apple extends Fruit{
    private String appleColor;

    public Apple(String name, String appleColor) {
        super(name);
        this.appleColor = appleColor;
    }

    @Override
    public void getColor() {
        super.getColor();
        System.out.println(appleColor + "색 입니다.");
    }
}
