package com.yin.service;

import com.yin.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author 17694
 * @date 2021/02/07
 **/
public class UserServiceTest {

    private UserServiceImpl userServiceimpl = new UserServiceImpl();
    @Test
    public void getUser() {
        userServiceimpl.getUser();
    }
}