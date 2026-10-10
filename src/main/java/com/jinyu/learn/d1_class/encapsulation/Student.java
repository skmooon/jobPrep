package com.jinyu.learn.d1_class.encapsulation;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.setAge(age);
    }
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0 || age> 150){
            System.out.println("年龄错误");
        } else{
            this.age = age;
        }
    }

    public void introduce(){
        System.out.println("大家好，我是" + this.getName() + "今年" + this.getAge() + "岁");
    }
}
