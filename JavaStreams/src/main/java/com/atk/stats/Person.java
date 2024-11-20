package com.atk.stats;

public class Person {

    String name;
    byte age;

    public Person(String name,byte age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){}
    public void setAge(byte age){}

    public String getName(){
        return name;
    }

    public byte getAge(){
        return age;
    }

}
