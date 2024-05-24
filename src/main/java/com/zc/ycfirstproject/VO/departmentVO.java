package com.zc.ycfirstproject.VO;




import com.zc.ycfirstproject.entity.User;

import java.io.Serializable;
import java.util.List;

public class departmentVO implements Serializable {
    public int Id;
    public String DeptName;
    public String Description;
    public int address;
    private List<User> list;

    public departmentVO() {
    }

    public departmentVO(int id, String deptName, String description, int address, List<User> list) {
        Id = id;
        DeptName = deptName;
        Description = description;
        this.address = address;
        this.list = list;
    }

    @Override
    public String toString() {
        return "DeptVo{" +
                "Id=" + Id +
                ", DeptName='" + DeptName + '\'' +
                ", Description='" + Description + '\'' +
                ", address=" + address +
                ", users=" + list +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}

