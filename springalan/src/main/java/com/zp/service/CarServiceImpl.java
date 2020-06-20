/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: CarServiceImpl
 *Auther: Administrator
 *Date: 2020/6/13 16:08
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.dao.CarDao;
import com.zp.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;
    @Override
    public int add(Car car) {
        System.out.println("service:add-----------"+car.getName());
        //carDao = new CarDaoImpl();
        int i = carDao.addCar(car);
        return i;
    }

//    public void setCarDao(CarDaoImpl carDao) {
//
//    }
}
