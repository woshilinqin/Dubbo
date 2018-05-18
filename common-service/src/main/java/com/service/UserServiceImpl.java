package com.service;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Description: author: LinQin date: 2018/05/03
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int getUserByNameAndPwd(User user) {
        return userDao.getUserByNameAndPwd(user);
    }

    @Override
    public int getCountNum() {
        return userDao.getCount();
    }
}
