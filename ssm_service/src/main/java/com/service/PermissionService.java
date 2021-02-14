package com.service;

import com.domain.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findPermissionAll();
    void insertPermission(Permission permission);
    List<Permission> findByName();
}
