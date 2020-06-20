/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ItemDaoImpl
 *Auther: Administrator
 *Date: 2020/6/10 6:44
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.dao;

import com.zonpe.domain.Item;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    @Override
    public List<Item> findAll() throws SQLException, ClassNotFoundException {
        ArrayList<Item> items = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        String sql = "select * from list";
        connection = DriverManager.getConnection("jdbc:mysql:///maven","root","root");
        preparedStatement = connection.prepareCall(sql);
        resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            Item item = new Item();
            item.setId(resultSet.getInt("id"));
            item.setName(resultSet.getString("name"));
            item.setStarttime(resultSet.getDate("starttime"));
            item.setInserttime(resultSet.getDate("inserttime"));
            items.add(item);
        }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }
        return items;
    }
}
