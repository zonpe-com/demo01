/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ListTset
 *Auther: Administrator
 *Date: 2020/6/10 14:36
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListTset {
    @Test
    public void listTest(){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list.size());
        for (Object s:list
             ) {
            //System.out.println(list.remove(s));
            System.out.println("s = " + s);
        }
        //list.clear();
        //System.out.println("---list = " + list);
    }
    @Test
    public void hashmapTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("a","sas");
        map.put("a","sas");
        map.put("a","ssss");
        System.out.println(map);
//        map.put("a","sas");
//        map.put("a","sas");
//        map.put("a","sas");
//        map.put("a","sas");

    }
}
