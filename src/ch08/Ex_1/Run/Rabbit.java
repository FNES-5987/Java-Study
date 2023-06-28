package ch08.Ex_1.Run;

public class Rabbit implements Runnable{

    @Override
    public String  run() {
        System.out.println("The rabbit is running fast!");
        return null;
    }
}
