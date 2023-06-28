package ch05;

public class Gpt_Ex_main {
    public static void main(String[] args) {
        Gpt_Ex_method method = new Gpt_Ex_method();
        method.setName("이름");
        method.setAge(23);
        method.introduce();

        //----------------------

        method.setAdd(1, 2);
        method.print();

        //----------------------


    }
}
