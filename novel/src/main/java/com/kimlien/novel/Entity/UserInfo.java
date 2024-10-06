package com.kimlien.novel.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_info")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String salt;
    private String nickname;
    private String userPhoto;
    private Integer userSex;
    private Long accountBalance;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getUserPhoto() {
        return userPhoto;
    }
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
    public Integer getUserSex() {
        return userSex;
    }
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }
    public Long getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt
                + ", nickname=" + nickname + ", userPhoto=" + userPhoto + ", userSex=" + userSex + ", accountBalance="
                + accountBalance + ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime
                + "]";
    }
}
