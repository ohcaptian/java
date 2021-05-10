package com.yin.service.impl;/**
 * @author 17694
 * @date 2021/02/07
 **/

import com.yin.dao.UserDao;
import com.yin.dao.imp.UserDaoImp;
import com.yin.dao.imp.UserDaoMySqlImpl;
import com.yin.service.UserService;

/**
 * @ClassName : UserService 
 * @Description :   
 */
public class UserServiceImpl implements UserService {
    /**
     *
     */
//    private UserDao userDao = new UserDaoImp();
//    private UserDao userDao1 = new UserDaoMySqlImpl();
//    public void getUser() {
//        userDao1.getUser();
//    }
    private UserDao userDaoNew;
    @Override
    public void setUserDao(UserDao userDao) {
        this.userDaoNew = userDao;
    }
    public void getUserNew() {
        userDaoNew.getUser();
    }


    @Override
    public void getUser() {

    }
}
