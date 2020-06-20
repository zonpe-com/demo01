/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: UseList
 *Auther: Administrator
 *Date: 2020/6/10 14:46
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe;

import java.util.ArrayList;
import java.util.List;

public class UseList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            System.out.println(list.remove(i)+"---"+i);
        }
        //list.clear();
        System.out.println("---list = " + list);
    }
}
