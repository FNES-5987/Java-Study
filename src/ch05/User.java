package ch05;

import java.util.regex.Pattern;

public class User {
    private String name;
    private int age;
    private String add;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    public String getAdd() {
        return add;
    }

    public void studentInfo () {
        System.out.println("이름 : " + name + " 나이 : " + age + " 이메일주소 : " + add);
    }

    public void upAge() {
       age = ++age;
    }

    public void changeAdd() {
        this.add = getAdd();
    }

}
