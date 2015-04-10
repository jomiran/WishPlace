package bross.wishplace.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String phone;
    private String password;
    private String sex;
    private String address;
    private int age;
    private String job;
    private int point;

    public User() {
    }

    public User(String email, String phone, String password, String sex,
                String address, int age, String job) {
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.job = job;
        this.point = 1000;
    }

    public User(String email, String phone, String password, String sex,
                String address, int age, String job, int point) {
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.job = job;
        this.point = point;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
