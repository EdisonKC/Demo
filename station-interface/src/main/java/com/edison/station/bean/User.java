package com.edison.station.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Integer stationId;
    private String workId;

    public User(int userId, String userName, int stationId, String workId) {
        this.userId = userId;
        this.userName = userName;
        this.stationId = stationId;
        this.workId = workId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }
}



