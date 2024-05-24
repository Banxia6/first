package com.zc.ycfirstproject.Controller;

import com.zc.ycfirstproject.Service.DepartmentService;
import com.zc.ycfirstproject.VO.departmentVO;
import com.zc.ycfirstproject.entity.Department;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    Logger logger = Logger.getLogger(DepartmentController.class);
    @GetMapping("/{id}")
    public Department GetById(@PathVariable int id) {
        logger.info("前端传来的参数"+id);
        System.out.println(6);
        return departmentService.SelectById(id);
    }

    @GetMapping
    public List<departmentVO> GetAll(Integer id) {
        return departmentService.departmentAll(id);
    }

    @PostMapping
    public String Register(@RequestBody Department department) {
        logger.info("前端传来的参数"+department);
        if (departmentService.insertToDepartment(department)) {
            return "插入成功";
        } else {
            return "插入失败";
        }
    }

    @PutMapping
    public String ModifyDepartment(@RequestBody Department department) {
        logger.info("前端传来的参数"+department);
        departmentService.update(department);
        return "修改成功";
    }

    @DeleteMapping("/{id}")
    public String DeleterDepartment(@PathVariable int id) {
        logger.info("前端传来的参数"+id);
        departmentService.delete(id);
        return "删除成功";
    }


}
