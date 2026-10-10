package com.jinyu.learn.d1_class.encapsulation;

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student("金鱼",19);
        Student student2 = new Student("金鱼",19);
        student2.setName("芝士球");
        Student student3 = new Student("广陵王",20);
        Student student4 = new Student();

        student1.introduce();
        student2.introduce();
        student3.introduce();
        student4.introduce();

        student2.setAge(-5);
        System.out.println(student2.getAge());
    }
}
