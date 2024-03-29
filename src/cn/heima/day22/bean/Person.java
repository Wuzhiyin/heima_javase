package cn.heima.day22.bean;

import java.io.*;

//对象流写出的自定义类必须实现Serializable或Externalizable接口
public class Person implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;

    public Person() {
        super();

    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
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
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }


}
