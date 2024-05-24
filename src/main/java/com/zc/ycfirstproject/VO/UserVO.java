package com.zc.ycfirstproject.VO;

public class UserVO {
    public String userName;
    public int gender;
    public int birthday;
    public int deptId;
    public String deptName;
    public String description;
    public int address;

    public UserVO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                '}';
    }

}
