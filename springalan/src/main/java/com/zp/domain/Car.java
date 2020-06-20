/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Car
 *Auther: Administrator
 *Date: 2020/6/13 16:04
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.domain;

public class Car {
    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String  toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
