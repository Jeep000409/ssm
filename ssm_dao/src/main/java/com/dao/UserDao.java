package com.dao;

import com.domain.SysUser;

import java.util.List;

public interface UserDao {

    SysUser findByUsername(String username);
    List<SysUser> findUserAll();
    void insertUser(SysUser sysUser);
    SysUser findByUsernameCheck(String username);
    SysUser findById(Integer id);
    void delRoleFromUser(Integer userId);
    void addRoleToUser( Integer userId,Integer roleId);
}
