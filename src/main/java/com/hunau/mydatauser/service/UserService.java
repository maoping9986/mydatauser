package com.hunau.mydatauser.service;
import com.hunau.mydatauser.entity.User;
import com.hunau.mydatauser.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private  UserDao userDao;
    public User selectUser(int id)//返回类型为表
    {
        return userDao.selectUser(id);
    }

    public List<User> findBy(String name)
    {
       return userDao.findBy(name);
    }
}
