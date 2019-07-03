package app.entities;

public class Employee {
    private String fio;
    private Integer age;
    private String sex;
    private double workTime;
    private String position;

    public Employee() {

    }

    public Employee(String fio, Integer age, String sex, double workTime, String position) {
        this.fio = fio;
        this.age = age;
        this.sex = sex;
        this.workTime = workTime;
        this.position = position;
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
