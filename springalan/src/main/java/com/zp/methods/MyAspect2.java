/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: MyAspect2
 *Auther: Administrator
 *Date: 2020/6/14 8:42
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.methods;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class MyAspect2 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("开启事务----");
        Object obj = methodInvocation.proceed();
        System.out.println("拦截--------");
        System.out.println("提交事务----");
        return obj;
    }
}
