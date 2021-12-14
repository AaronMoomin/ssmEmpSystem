package com.jie.pojo;

import java.util.Date;

public class Emp {
    private int id;
    private String userName;
    private String birthday;
    private String entryDate;
    private String job;
    private double salary;
    private String resume;
    private Dept dept;

    public Emp() {
    }

    public Emp(int id, String userName, String birthday, String entryDate, String job, double salary, String resume, Dept dept) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.entryDate = entryDate;
        this.job = job;
        this.salary = salary;
        this.resume = resume;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", entryDate=" + entryDate +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", resume='" + resume + '\'' +
                ", dept=" + dept+
                '}';
    }
}
