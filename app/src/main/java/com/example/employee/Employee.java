package com.example.employee;

public class Employee {
    private String name;
    private String sex;
    private  String domicile;
    private int age;

    public Employee(String name, String sex, String domicile, int age) {
        this.name = name;
        this.sex = sex;
        this.domicile = domicile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDomicile() {
        return domicile;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
