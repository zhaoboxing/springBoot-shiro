package com.unistrong.springbootshirodemo.config;

import com.unistrong.springbootshirodemo.bean.User;
import com.unistrong.springbootshirodemo.dao.*;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//获取用户的角色和权限信息,自定义realm
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    //验证权限时调用
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //通过用户名查询用户所有角色和权限
        String account = (String) principalCollection.getPrimaryPrincipal();
        //通过账号查询用户id
        User user = userMapper.selectByAccount(account);
        if (user != null) {
            //通过用户id查询角色id
            List<Integer> roleIds = userRoleMapper.selectRoleIdsByUserId(user.getId());
            List<String> roles = roleMapper.slectByPrimaryKeyList(roleIds);
            if (roles.size() > 0 && roles != null) {
                simpleAuthorizationInfo.addRoles(roles);
            }
            //查询角色所有的权限url
            //查出所有权限id
            Set<Integer> perssionIds = rolePermissionMapper.selectPermissionIdsByRoleIds(roleIds);
            if (perssionIds.size() > 0 && perssionIds != null) {
                //查出所有权限url
                List<String> permissions = permissionMapper.selectPermissionNamesByPrimaryKeys(new ArrayList<>(perssionIds));
                if (permissions.size() > 0 && permissions != null) {
                    simpleAuthorizationInfo.addStringPermissions(permissions);
                }
            }
            return simpleAuthorizationInfo;
        }
        return simpleAuthorizationInfo;
    }

    //登录时调用认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String account = (String) authenticationToken.getPrincipal();
        //查询是否有此用户
        User user = userMapper.selectByAccount(account);
        if (user != null) {
            String password = user.getPassword();
            //将查询到的该账号信息封装到shiro中
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(account, password, null, getName());
            return simpleAuthenticationInfo;
        }
        return null;
    }
}
