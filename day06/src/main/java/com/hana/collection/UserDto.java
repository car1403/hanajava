package com.hana.collection;

import java.time.LocalDate;

public class UserDto {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private long money;
    private LocalDate regdate;

    public UserDto() {
    }

    public UserDto(String id, String pwd, String name, int age, long money, LocalDate regdate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.money = money;
        this.regdate = regdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public LocalDate getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDate regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", regdate=" + regdate +
                '}';
    }
}
