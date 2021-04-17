package com.company;/*
@USER: dench
@DATE: 17.04
@NAME: FullTimeEmployee
@TIME: 13:40
*/

public class FullTimeEmployee implements IAccounting {
    private String name;
    private Integer experience;
    private Integer rate;
    private String speciality;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, Integer experience, Integer rate, String speciality) {
        this.name = name;
        this.experience = experience;
        this.rate = rate;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", rate=" + rate +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public int getSalary() {
        return this.getRate() * 22 * 8;
    }
}
