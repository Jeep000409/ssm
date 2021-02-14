package com.service.impl;

import com.dao.UserDao;
import com.domain.Role;
import com.domain.SysUser;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user=userDao.findByUsername(username);
        if (user !=null){
//            创建用户详情对象
//                创建角色集合对象
            Collection<GrantedAuthority> authorities=new ArrayList<>();
//              角色名称从数据库中查询
           for(Role role: user.getRoleList()){
               SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority("ROLE_"+role.getRoleName());
//               添加到集合中
               authorities.add(simpleGrantedAuthority);
           }

            User userDetails=new User(user.getUsername(),user.getPassword(),authorities);
            return userDetails;
        }

        return null;
    }

    @Override
    public List<SysUser> findUserAll() {
        List<SysUser> sysUserList=this.userDao.findUserAll();
        return sysUserList;
    }

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public void insertUser(SysUser sysUser) {
        String password=sysUser.getPassword();
        String encode=passwordEncoder.encode(password);
        sysUser.setPassword(encode);
        userDao.insertUser(sysUser);
    }

    @Override
    public SysUser findByNameCheck(String username) {
        return userDao.findByUsernameCheck(username);
    }

    @Override
    public SysUser findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void addRoleToUser(Integer userId, Integer[] ids) {
//        删除原来所有的关系
        userDao.delRoleFromUser(userId);
//          维护新的关系
        if(ids !=null) {
            for (Integer roleId :ids) {
                userDao.addRoleToUser(userId,roleId);
            }
        }
    }
}
