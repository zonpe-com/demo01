/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: MyAspect3
 *Auther: Administrator
 *Date: 2020/6/14 13:15
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.methods;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect3 {
    /**
     * 可以通过声明一个公共的切入点，然后其他注解里直接引用即可，pointCut=myPointCut()
     */
    @Pointcut("execution(* com.zp.service.CarServiceImpl.add(..))")
    public void commonPoint(){};

    //切面bean加上 comonent注解
    @Before("execution(* com.zp.service.CarServiceImpl.add(..))")
    public void before(){
        System.out.println("前置通知--=============--");
    }
    //后置通知可以获取到返回值
    @AfterReturning(pointcut = "commonPoint()",returning = "returnObj")
    public void after(JoinPoint joinPoint,Object returnObj){
        System.out.println("返回值为：---"+returnObj);
        System.out.println("后置通知-------=======--------");
    }
//    @Around("commonPoint()")
//    public void around(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("环绕通知-------=======--------"+proceedingJoinPoint.getSignature().getName());
//    }
    @AfterThrowing(pointcut = "commonPoint()",throwing = "throwable")
    public void myThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("异常通知---"+joinPoint.getSignature().getName()+"----"+throwable.getMessage());
    }
    @After("commonPoint()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知------------"+joinPoint.getSignature().getName());
    }
}
