package com.dao;

import com.domain.Permission;

import java.util.List;

public interface PermissionDao {
    List<Permission> findPermissionAll();
    void insertPermission(Permission permission);
    List<Permission> findByName();
    List<Permission> findPermissionByRoleId(Integer roleId);
}
