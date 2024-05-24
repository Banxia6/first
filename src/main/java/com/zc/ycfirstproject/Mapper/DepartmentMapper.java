package com.zc.ycfirstproject.Mapper;


import com.zc.ycfirstproject.VO.departmentVO;
import com.zc.ycfirstproject.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<departmentVO> departmentAll(Integer id);

    Department selectById(int id);

    Boolean insertToDepartment(Department department);

    Integer update(Department department);

    Integer delete(int id);
}