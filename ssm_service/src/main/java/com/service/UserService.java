package com.service;

import com.domain.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findUserAll();
    void insertUser(SysUser sysUser);
    SysUser findByNameCheck(String username);
    SysUser findById(Integer id);
    void addRoleToUser(Integer userId, Integer[] ids);
}
