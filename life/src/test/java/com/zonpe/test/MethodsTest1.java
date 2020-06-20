/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: MethodsTest1
 *Auther: Administrator
 *Date: 2020/6/12 6:44
 *Description: 测试面试题中的方法
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.test;

public class MethodsTest1 {
    public void method (Object object){
        System.out.println("Object = " + object);
    }
    public void method (String string){
        System.out.println("string = " + string);
    }
    //String 是 Object 的子类
    public static void main(String[] args) {
        new MethodsTest1().method(null);
    }
}
