package com.adilmx.jpaApp.service.impl;

import com.adilmx.jpaApp.dao.UserDao;
import com.adilmx.jpaApp.dao.impl.UserDaoImpl;
import com.adilmx.jpaApp.model.User;
import com.adilmx.jpaApp.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public int saveUser(User user) {
        int isSaved = 0;
        boolean res =  userDao.save(user);
        if(res){
            isSaved = 1;
        }
        return isSaved;
    }
}
