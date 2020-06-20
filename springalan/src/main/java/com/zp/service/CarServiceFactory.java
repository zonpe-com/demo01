/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: CarServiceFactory
 *Auther: Administrator
 *Date: 2020/6/13 19:49
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.domain.Car;
import com.zp.methods.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CarServiceFactory {
    public static CarService createCarService(){
        //匿名内部类要访问外部成员变量时候，外部变量要加final修饰
        final CarService carService = new CarServiceImpl();
        MyAspect myAspect = new MyAspect();
        CarService proxyCarService = (CarService) Proxy.newProxyInstance(CarServiceFactory.class.getClassLoader(), carService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.before();
                Object invoke = method.invoke(carService, args);
                myAspect.after();
                System.out.println("------"+invoke);
                return invoke;
            }
        });
        return proxyCarService;
    };
    public static CarService createCarService2(){
        final CarService carService = new CarServiceImpl();
        MyAspect myAspect = new MyAspect();
        Enhancer enhancer = new Enhancer();
        //传入父类
        enhancer.setSuperclass(carService.getClass());
        //传入回调方法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //System.out.println(o); //不能直接打印，会报错 ，这个就是代理对象
                System.out.println(o.getClass());
                System.out.println(method);
                System.out.println(objects);
                myAspect.before();
                //以下调用原本方法有两种等效写法
                Object retuobj = method.invoke(carService, objects);
                //下面的写法等效于上面
                //Object proxyobj = methodProxy.invokeSuper(carService, objects);
                myAspect.after();
                System.out.println("拦截--------");
                return retuobj;
            }
        });
        //创建代理对象
        CarService carService2 = (CarService) enhancer.create();
        //System.out.println("carService2 = " + carService2);
        return carService2;
    }
}
