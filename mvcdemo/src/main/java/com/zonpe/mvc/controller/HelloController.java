/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: HelloController
 *Auther: Administrator
 *Date: 2020/6/17 18:24
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    //这个注解会决定访问的路径
    @RequestMapping("hello")
    public ModelAndView hello(){
        System.out.println("Hello springmvc!---");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","Hello SpringMVC !");
        //这个地方配置路径是针对的服务器里页面位置的路径，与浏览器的访问路径无关
        modelAndView.setViewName("hello");
        System.out.println("Hello Springmvc!---");
        return modelAndView;
        //出现404可能是，浏览器访问服务器资源的路径不对，
        // 可能是没有找到对应的controller，
        // 或者是没有找到controller下对应的映射@RequestMapping("hello")
        //或者是映射下返回的试图地址不对 modelAndView.setViewName("hello");
        // 包括applicationContextXML配置文件里试图解析器里配置的前后缀不对
    }
}
