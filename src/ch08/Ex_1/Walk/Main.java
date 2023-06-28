package ch08.Ex_1.Walk;

import ch08.Ex_1.Run.Rabbit;
import ch08.Ex_1.Run.Runnable;
import ch08.Ex_1.Swim.Fish;
import ch08.Ex_1.Swim.Swimmable;

public class Main implements Runnable, Swimmable {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        System.out.println(fish.swim() + rabbit.run());
    }

    @Override
    public String run() {
        return null;
    }

    @Override
    public String swim() {
        return null;
    }
}
