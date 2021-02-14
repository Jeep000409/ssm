package com.service;

import com.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findRoleAll();
    void insertRole(Role role);
    Role findById(Integer roleId);
    void addRoleToPermission(Integer roleId, Integer[] ids);
}
