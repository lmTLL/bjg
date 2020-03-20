package com.imtll.bjg.config;

import com.imtll.bjg.realm.UserRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Create with IDEA
 *
 * @ClassName ShiroConfig
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 9:55
 * @Version 1.0
 */
@Configuration//标记这是一个配置
public class ShiroConfig {
    //1、生成Realm对象
    @Bean
    public UserRealm createRealm(){
        return new UserRealm();
    }
    //2、生成权限管理器
    @Bean
    public DefaultWebSecurityManager securityManager(UserRealm userRealm){
        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();

        webSecurityManager.setRealm(userRealm);

        return webSecurityManager;
    }
    //3、配置管理器工厂

    @Bean
    public ShiroFilterFactoryBean createShiroFilter(DefaultWebSecurityManager webSecurityManager){
        ShiroFilterFactoryBean factoryBean=new ShiroFilterFactoryBean();
        //设置三个路径 一个管理器
        factoryBean.setLoginUrl("login.html");//登录页面
        factoryBean.setSuccessUrl("index.html");//成功页面
        factoryBean.setUnauthorizedUrl("error.html");//失败页面
        factoryBean.setSecurityManager(webSecurityManager);//设置管理器

        //设置放行和拦截的资源
        Map<String,String> map=new HashMap<>();
        //放行静态资源 css、js、图片 最后都在同一个文件夹中
//        map.put("/media/**","anon");
//        map.put("/login.html","anon");
//        map.put("/index.html","anon");
//        map.put("/register.html","anon");
//        map.put("/login.do","anon");
//        map.put("/register.do","anon");
        //剩下全部拦截
//        map.put("/**","authc");
        map.put("/**","anon");
        //anon 表示不用登录就可以访问
        //authc  必须登录之后才可以访问


        factoryBean.setFilterChainDefinitionMap(map);

        return factoryBean;


    }
}
