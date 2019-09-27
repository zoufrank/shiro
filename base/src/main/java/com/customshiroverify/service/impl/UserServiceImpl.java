package com.customshiroverify.service.impl;

import com.customshiroverify.dao.UserDao;
import com.customshiroverify.entity.User;
import com.customshiroverify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Auther: zhangyingqi
 * @Date: 2018/8/27 17:26
 * @Description:
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
