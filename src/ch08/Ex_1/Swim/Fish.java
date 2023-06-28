package ch08.Ex_1.Swim;

public class Fish implements Swimmable{

    @Override
    public String  swim() {
        System.out.println("The fish is swimming");
        return null;
    }
}
