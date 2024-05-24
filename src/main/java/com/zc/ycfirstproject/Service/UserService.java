package com.zc.ycfirstproject.Service;

import com.zc.ycfirstproject.VO.UserVO;
import com.zc.ycfirstproject.entity.User;
import org.eclipse.jdt.internal.compiler.env.IModule;

import java.util.List;

public interface UserService {
    User SelectById(int id);
    List<User> SelectAll();

    Boolean insertToUser(User user);
    int update(User user);
    void delete(int id);
    List<UserVO> findUserDept();
}
