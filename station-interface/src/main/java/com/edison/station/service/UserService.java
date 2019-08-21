package com.edison.station.service;

import com.edison.station.bean.User;

import java.util.List;

public interface UserService {
    public List<User>getUserList(String workId);
}
