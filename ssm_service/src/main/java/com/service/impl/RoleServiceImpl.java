package com.service.impl;

import com.dao.RoleDao;
import com.domain.Role;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public List<Role> findRoleAll() {
        List<Role> roleList=roleDao.findRoleAll();
        return roleList;
    }

    @Override
    public void insertRole(Role role) {
        roleDao.insertRole(role);
    }

    @Override
    public Role findById(Integer roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public void addRoleToPermission(Integer roleId, Integer[] ids) {
        roleDao.delRoleFromPermission(roleId);
        if(roleId !=null){
            for (Integer permissionId:ids){
                roleDao.addRoleToPermission(permissionId,roleId);
            }
        }
    }
}
