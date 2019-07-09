package app.entities;

import app.model.Model;

public class Employee {
    private Integer id;
    private String fio;
    private Integer age;
    private String sex;
    private double workTime;
    private String position;

    public Employee() {

    }

    public Employee(Integer id ,String fio, Integer age, String sex, double workTime, String position) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.sex = sex;
        this.workTime = workTime;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return getFio() + " " + getSex() + " " + getAge() + " " + getPosition() + " " + getWorkTime();
    }
}
