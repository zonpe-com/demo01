/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: CustomerServiceImpl
 *Auther: Administrator
 *Date: 2020/6/13 10:17
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.domain.Car;

public class CustomerServiceImpl implements CustomerService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户·······"+name );
    }

    @Override
    public void add(Car car) {

    }
}
