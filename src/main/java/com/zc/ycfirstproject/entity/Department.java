package com.zc.ycfirstproject.entity;

public class Department {
    public int id;
    public String DeptName;
    public String Description;
    public int address;

    public Department() {
    }

    public Department(int id, String deptName, String description, int address) {
        this.id = id;
        this.DeptName = deptName;
        this.Description = description;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", DeptName='" + DeptName + '\'' +
                ", Description='" + Description + '\'' +
                ", address=" + address +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
