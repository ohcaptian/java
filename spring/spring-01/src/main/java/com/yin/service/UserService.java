package com.yin.service;

import com.yin.dao.UserDao;

/**
 * @author 17694
 * @date 2021/02/07
 **/
public interface UserService {
    public void getUser();
    public void setUserDao(UserDao userDao);
    public void getUserNew();
}
