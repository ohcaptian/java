package com.yin.dao.imp;/**
 * @author 17694
 * @date 2021/02/07
 **/

import com.yin.dao.UserDao;

/**
 * @ClassName : UserDaoImp 
 * @Description :   
 */
public class UserDaoImp implements UserDao {

    @Override
    public void getUser() {
        System.out.println("获取用户数据");
    }
}
