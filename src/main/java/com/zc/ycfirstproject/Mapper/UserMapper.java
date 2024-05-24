package com.zc.ycfirstproject.Mapper;

import com.zc.ycfirstproject.VO.UserVO;
import com.zc.ycfirstproject.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface  UserMapper {
    List<User> selectAll();

    User selectById(int id);

    Boolean insertToUser(User user);

    Integer update(User user);

    Integer delete(int id);
    List<UserVO> findUserDept ();
}

