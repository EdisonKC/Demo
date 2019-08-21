package com.edison.station.service.impl;

import com.edison.station.bean.User;
import com.edison.station.service.OrderService;
import com.edison.station.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    public List<User> initOrder(String workId){
        System.out.println("员工id:" + workId);
        List<User> userList = userService.getUserList(workId);
        for (User user:userList
             ) {
            System.out.println(user.getUserName());
        }
        return userList;
    }

}
