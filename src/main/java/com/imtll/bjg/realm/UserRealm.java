package com.imtll.bjg.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Create with IDEA
 *
 * @ClassName UserRealm
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 9:58
 * @Version 1.0
 * 继承AuthorizingRealm
 */
public class UserRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {



        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取传递的令牌
        UsernamePasswordToken userToken=(UsernamePasswordToken) authenticationToken;
        //验证令牌是否为空
        if(userToken.getUsername()!=null){

            //创建认证信息  参数说明：1、用户名 2、密码 3、realm的名字
            SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(userToken.getUsername(),userToken.getPassword(),getName());
            return authenticationInfo;
        }
        return null;
    }
}
