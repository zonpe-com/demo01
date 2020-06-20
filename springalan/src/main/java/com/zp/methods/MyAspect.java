/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Aspect
 *Auther: Administrator
 *Date: 2020/6/13 19:57
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.methods;

public class MyAspect {
    public void before(){
        System.out.println("方法调用之前的增强，比如开启事务");
    }
    public void after(){
        System.out.println("方法调用之后的增强，比如提交事务");
    }
}
