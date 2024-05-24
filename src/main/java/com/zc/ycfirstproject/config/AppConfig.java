package com.zc.ycfirstproject.config;

import com.zc.ycfirstproject.Mapper.DepartmentMapper;
import com.zc.ycfirstproject.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class AppConfig{
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(is);
    }

    @Bean
    public UserMapper userMapper(SqlSessionFactory sqlSessionFactory){
        return sqlSessionFactory.openSession(true).getMapper(UserMapper.class);
    }
    @Bean
    public DepartmentMapper departmentMapper(SqlSessionFactory sqlSessionFactory){
        return sqlSessionFactory.openSession(true).getMapper(DepartmentMapper.class);
    }


}