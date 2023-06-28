package ch05.stsatics;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        // c.count == 1
        System.out.println(c.getCount());
        // c.count == 2

        Counter c2 = new Counter();
        // c2.count == 1(X), == 3(O)
        System.out.println(c2.getCount());
        // c2.count == 2(X), == 4(O)
    }

}
