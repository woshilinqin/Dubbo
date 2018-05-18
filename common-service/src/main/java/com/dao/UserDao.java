package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Description:
 * author: LinQin
 * date: 2018/05/03
 */
@MapperScan
public interface UserDao {
    public int getUserByNameAndPwd(User user);

    @Select("select count(1) from trans")
    public int getCount();

}
