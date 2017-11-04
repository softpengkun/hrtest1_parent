package com.pk.model;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class Users {
    private Integer uid;
    private String uname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Users(String uname, Integer uid) {
        this.uname = uname;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                '}';
    }
}
