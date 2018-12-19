package com.unistrong.springbootshirodemo.config;


import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


// shiro的配置类
@Configuration
public class ShiroConfiguration {

    //Filter工厂，设置对应的过滤条件和跳转条件
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);
        Map<String,String> map = new HashMap<String, String>();
        //登出
        map.put("/logout.html","logout");
        //对所有用户认证
        map.put("/index.html","anon");
        map.put("/login.html","anon");
        map.put("/map.html","anon");
        map.put("/ticket.html","anon");
        map.put("/photo.html","anon");
        map.put("/gologoin.html","anon");
        map.put("/menu/**","authc,roles[admin],perms[menus:*]");
        //登录
        shiroFilter.setLoginUrl("/gologin.html");
        //首页
        shiroFilter.setSuccessUrl("/index.html");
//        //错误页面，认证不通过跳转
//        shiroFilter.setUnauthorizedUrl("/error.html");
        shiroFilter.setFilterChainDefinitionMap(map);
        return shiroFilter;
    }
    //将自己的验证方式加入容器
    @Bean
    public ShiroRealm shiroRealm() {
        ShiroRealm shiroRealm = new ShiroRealm();
        return shiroRealm;
    }
    //权限管理，配置主要是Realm的管理认证
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager =new DefaultWebSecurityManager();
        securityManager.setRealm(shiroRealm());
        return securityManager;
    }
    //加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }


}
