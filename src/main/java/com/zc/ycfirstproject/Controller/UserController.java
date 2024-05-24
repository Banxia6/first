package com.zc.ycfirstproject.Controller;

import com.zc.ycfirstproject.Service.UserService;
import com.zc.ycfirstproject.VO.UserVO;
import com.zc.ycfirstproject.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    org.apache.log4j.Logger logger = Logger.getLogger(DepartmentController.class);

    @GetMapping("/{id}")
    public User GetById(@PathVariable int id) {
        logger.info("前端传来的参数" + id);
        return userService.SelectById(id);
    }

    @GetMapping
    public List<User> GetAll() {
        return userService.SelectAll();
    }

    @PostMapping
    public String Register(@RequestBody User user) {
        logger.info("前端传来的参数" + user);
        if (userService.insertToUser(user)) {
            return "插入成功";
        } else {
            return "插入失败";
        }
    }

    @PutMapping
    public String ModifyUser(@RequestBody User user) {
        logger.info("前端传来的参数" + user);
        userService.update(user);
        return "修改成功";
    }

    @DeleteMapping("/{id}")
    public String DeleterUser(@PathVariable int id) {
        logger.info("前端传来的参数" + id);
        userService.delete(id);
        return "删除成功";
    }

    @GetMapping("/findUserDept")
    public List<UserVO> findUserDept() {

        return userService.findUserDept();
    }
}
