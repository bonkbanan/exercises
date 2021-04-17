package com.company;/*
@USER: dench
@DATE: 17.04
@NAME: Student
@TIME: 10:53
*/

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthday;
    private Integer markJava;

    public Student() {
    }

    public Student(String name, LocalDate birthday, Integer markJava) {
        this.name = name;
        this.birthday = birthday;
        this.markJava = markJava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getMarkJava() {
        return markJava;
    }

    public void setMarkJava(Integer markJava) {
        this.markJava = markJava;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", markJava=" + markJava +
                '}';
    }
}
