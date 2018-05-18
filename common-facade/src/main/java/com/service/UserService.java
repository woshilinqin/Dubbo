package com.service;

import com.pojo.User;

/**
 * Description: author: LinQin date: 2018/05/03
 */

public interface UserService {
    public int getUserByNameAndPwd(User user);

    /**
     * 测试mybatis注解
     * 
     * @return
     */
    public int getCountNum();
}
