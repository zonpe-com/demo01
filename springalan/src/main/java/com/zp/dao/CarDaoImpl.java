/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: CarDaoImpl
 *Auther: Administrator
 *Date: 2020/6/14 11:50
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.dao;

import com.zp.domain.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public int addCar(Car car) {
        System.out.println("dao:add------------"+car.getName());
        return car.getPrice();
    }
}
