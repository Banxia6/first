package com.zc.ycfirstproject;

import com.zc.ycfirstproject.Mapper.DepartmentMapper;
import com.zc.ycfirstproject.Mapper.UserMapper;
import com.zc.ycfirstproject.VO.departmentVO;
import com.zc.ycfirstproject.VO.UserVO;
import com.zc.ycfirstproject.entity.Department;
import com.zc.ycfirstproject.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemoTest {
    private static SqlSession getSqlSession(){
        //读取MyBaits的核心配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建SqlSessionFactory对象(通过创建SqlSessionFactoryBuilder来进行获取)
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建sqlSession对象（MyBatis的操作数据库的会话对象，通过此对象可以获取SQL语句，并执行）
        //注意：openSession对象默认是不会进行自动的事务提交的,所以我们如果想做DML操作并且自动事务提交，需要加上true参数，默认为false
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
    @Test
    public void selectByIdTest(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    public void selectAllTest(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        users.forEach(System.out::println);
    }
    @Test
    public void insertToUserTest(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(10,"zhangsan","122456",1,"2002.7.9",1);
        boolean num = userMapper.insertToUser(user);
        System.out.println(num);
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(10,"lisi","122456",1,"2002.7.9",2);
        Integer num = userMapper.update(user);
        System.out.println(num);
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer num = userMapper.delete(14);
        System.out.println(num);
    }
    @Test
    public void findUserDept(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserVO> list = userMapper.findUserDept();
        list.forEach(System.out::println);
    }


//    @Test
//    public void selectByIdTest2(){
//        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
//        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
//        List<departmentVO> department = (List<departmentVO>) departmentMapper.selectById(1);
//        System.out.println(department);
//    }
    @Test
    public void selectAllTest2(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        List<departmentVO> departments = departmentMapper.departmentAll(2);
        departments.forEach(System.out::println);
    }
    @Test
    public void insertToUserTest2(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = new Department(11,"zhangsan","122456",1);
        boolean num = departmentMapper.insertToDepartment(department);
        System.out.println(num);
    }

    @Test
    public void updateTest2(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = new Department(5,"lisi","122456",2);
        Integer num = departmentMapper.update(department);
        System.out.println(num);
    }

    @Test
    public void deleteTest2(){
        SqlSession sqlSession = MyBatisDemoTest.getSqlSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Integer num = departmentMapper.delete(5);
        System.out.println(num);
    }

}
