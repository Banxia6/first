package com.zc.ycfirstproject.Service;

import com.zc.ycfirstproject.VO.departmentVO;
import com.zc.ycfirstproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department SelectById(int id);
    List<departmentVO> departmentAll(Integer id);

    Boolean insertToDepartment(Department department);
    int update(Department department);
    void delete(int id);}
