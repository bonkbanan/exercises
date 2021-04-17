package com.company;/*
@USER: dench
@DATE: 17.04
@NAME: FullTimeEmployee
@TIME: 13:40
*/

public class FullTimeEmployee {
    private String name;
    private String experience;
    private Integer rate;
    private String speciality;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, String experience, Integer rate, String speciality) {
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
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
}
