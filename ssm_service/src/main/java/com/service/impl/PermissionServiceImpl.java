package com.service.impl;

import com.dao.PermissionDao;
import com.domain.Permission;
import com.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionDao permissionDao;

    @Override
    public List<Permission> findPermissionAll() {
        List<Permission> permissionList=permissionDao.findPermissionAll();
        return permissionList;
    }

    @Override
    public void insertPermission(Permission permission) {
        permissionDao.insertPermission(permission);
    }

    @Override
    public List<Permission> findByName() {
        List<Permission> permissionList=permissionDao.findByName();
        return permissionList;
    }
}
