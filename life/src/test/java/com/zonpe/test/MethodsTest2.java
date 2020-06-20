/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: MethodsTest2
 *Auther: Administrator
 *Date: 2020/6/12 6:48
 *Description: 面试题的测试方法
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.test;

import org.junit.Test;

public class MethodsTest2 extends Base{
    @Test
    public void main() {
        //一、getClass方法来自Object类，它返回对象在运行时的类型，
        // 因为在运行时的对象类型是Test，所以this.getClass()和super.getClass都是返回Test。
        System.err.println(this.getClass());
        System.err.println(super.getClass());
        //二、由于getClass()在Object类中定义成了final，子类不能覆盖该方法，
        // 所以，在test方法中调用getClass().getName()方法
        //其实就是在调用从父类继承的getClass()方法，等效于调用super.getClass().getName()方法，

        //所以，super.getClass().getName()方法返回的也应该是Test。
        System.err.println(super.getClass().getName());
        //如果想得到父类的名称，应该用如下代码：getClass().getSuperClass().getName();
        System.err.println(this.getClass().getSuperclass().getName());
    }

}
class Base{

}