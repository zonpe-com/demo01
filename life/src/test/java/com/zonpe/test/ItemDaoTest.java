/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ItemDaoTest
 *Auther: Administrator
 *Date: 2020/6/10 7:03
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.test;

import com.zonpe.dao.ItemDao;
import com.zonpe.dao.ItemDaoImpl;
import com.zonpe.domain.Item;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class ItemDaoTest {
    @Test
    public void findAll() throws SQLException, ClassNotFoundException {
        ItemDao itemDao = new ItemDaoImpl();
        List<Item> all = itemDao.findAll();
        for (Item i:all
             ) {
//            Integer id = i.getId();
//            String name = i.getName();
//            Date starttime = i.getStarttime();
//            Date inserttime = i.getInserttime();
            System.out.println(i);
        }
    }
}
