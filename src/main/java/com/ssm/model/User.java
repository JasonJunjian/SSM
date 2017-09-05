package com.ssm.model;

import java.util.Date;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public class User {
    private Integer ID;
    private Date UpdateTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getLoginTimes() {
        return LoginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        LoginTimes = loginTimes;
    }

    public Date getLatestLoginTime() {
        return LatestLoginTime;
    }

    public void setLatestLoginTime(Date latestLoginTime) {
        LatestLoginTime = latestLoginTime;
    }

    public Date getCurrLoginTime() {
        return CurrLoginTime;
    }

    public void setCurrLoginTime(Date currLoginTime) {
        CurrLoginTime = currLoginTime;
    }

    public String getLatestLoginIP() {
        return LatestLoginIP;
    }

    public void setLatestLoginIP(String latestLoginIP) {
        LatestLoginIP = latestLoginIP;
    }

    public String getCurrLoginIP() {
        return CurrLoginIP;
    }

    public void setCurrLoginIP(String currLoginIP) {
        CurrLoginIP = currLoginIP;
    }

    public Short getIsUse() {
        return IsUse;
    }

    public void setIsUse(Short isUse) {
        IsUse = isUse;
    }

    private Date CreateTime;
    private Integer STATE;
    private String LoginName;
    private String UserName;
    private String Password;
    private Integer LoginTimes;
    private Date LatestLoginTime;
    private Date CurrLoginTime;
    private String LatestLoginIP;
    private String CurrLoginIP;
    private Short IsUse;

}
