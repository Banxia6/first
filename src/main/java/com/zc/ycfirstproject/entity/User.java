package com.zc.ycfirstproject.entity;

public class User {
    public int id;
    public String userName;
    public String password;
    public int gender;
    public String birthday;
    public int deptId;

    public User() {
    }

    public User(int id, String userName, String password, int gender, String birthday, int deptId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.deptId = deptId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + userName + '\'' +
                ", Password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
