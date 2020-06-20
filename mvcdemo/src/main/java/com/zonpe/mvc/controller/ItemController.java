/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ItemController
 *Auther: Administrator
 *Date: 2020/6/18 13:42
 *Description: 项目列表展示
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.mvc.controller;

import com.zonpe.mvc.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping("items")
    public ModelAndView items(){
        ModelAndView modelAndView = new ModelAndView();
        List<Item> items = Arrays.asList(
                new Item(1, "冰箱", 1999.90, new Date(), "这个宝贝新上架的，冰箱很不错。"),
                new Item(1, "空调", 2999.90, new Date(), "这个宝贝新上架的，空调很不错。"),
                new Item(1, "洗衣机", 2299.90, new Date(), "这个宝贝新上架的，洗衣机很不错。"),
                new Item(1, "热水器", 1199.90, new Date(), "这个宝贝新上架的，热水器很不错。"));
        modelAndView.addObject("items",items);
        modelAndView.setViewName("item");
        System.out.println("item-------------");
        return modelAndView;
    }
}
