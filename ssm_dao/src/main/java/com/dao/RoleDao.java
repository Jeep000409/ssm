package com.dao;

import com.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findRoleAll();
    void insertRole(Role role);
    List<Role> findRoleByUserId(Integer userId);
    Role findById(Integer roleId);
    void delRoleFromPermission(Integer roleId);
    void addRoleToPermission(Integer permissionId,Integer roleId);
}
