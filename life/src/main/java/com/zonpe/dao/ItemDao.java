package com.zonpe.dao;/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ItemDao
 *Auther: Administrator
 *Date: 2020/6/10 6:38
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zonpe.domain.Item;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {
    List<Item> findAll() throws SQLException, ClassNotFoundException;
}
