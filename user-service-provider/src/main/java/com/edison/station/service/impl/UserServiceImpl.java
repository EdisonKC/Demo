package com.edison.station.service.impl;

import com.edison.station.bean.User;
import com.edison.station.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<User> getUserList(String workId){
        User user1 = new User(1,"陈冬平",1,"1");
        User user2 = new User(2,"周富斌",2,"1");
        return Arrays.asList(user1,user2);
    }
}
