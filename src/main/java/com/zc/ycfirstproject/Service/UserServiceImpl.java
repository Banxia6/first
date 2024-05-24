package com.zc.ycfirstproject.Service;

import com.zc.ycfirstproject.Mapper.UserMapper;
import com.zc.ycfirstproject.VO.UserVO;
import com.zc.ycfirstproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public User SelectById(int id){
        return userMapper.selectById(id);
    }
    public List<User> SelectAll(){return userMapper.selectAll();}
    public Boolean insertToUser(User user){return userMapper.insertToUser(user);}
    public int update(User user){return userMapper.update(user);}
    public void delete(int id){userMapper.delete(id);}
    public List<UserVO> findUserDept(){return userMapper.findUserDept();}
}
