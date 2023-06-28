package ch05;

public class Gpt_Ex_method {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void introduce() {
        System.out.println("저는 " + name + "이고, " + age + "살 입니다.");
    }

    // -------------------

    private int add;

    public void setAdd(int num1, int num2) {
        int sum = num1 + num2;
        this.add = sum;
    }
    public int getAdd(){
        return add;
    }
    public void print(){
        System.out.println(add);
    }

    //---------------

}
