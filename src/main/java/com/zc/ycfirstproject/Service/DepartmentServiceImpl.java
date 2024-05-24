package com.zc.ycfirstproject.Service;

import com.zc.ycfirstproject.Mapper.DepartmentMapper;
import com.zc.ycfirstproject.VO.departmentVO;
import com.zc.ycfirstproject.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;
    public Department SelectById(int id){
        return departmentMapper.selectById(id);
    }


    public List<departmentVO> departmentAll(Integer id){return departmentMapper.departmentAll(id);}
    public Boolean insertToDepartment(Department department){return departmentMapper.insertToDepartment(department);}
    public int update(Department department){return departmentMapper.update(department);}
    public void delete(int id){departmentMapper.delete(id);}
}
