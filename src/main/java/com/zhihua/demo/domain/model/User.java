package com.zhihua.demo.domain.model;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/15
 */

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private String nickName;
    private String email;
    private String wuid;

    public User() {
        super();
    }

    public User(String userName, String passWord) {
        super();
        this.passWord = passWord;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "userName " + this.userName + ", pasword " + this.passWord ;
    }

}