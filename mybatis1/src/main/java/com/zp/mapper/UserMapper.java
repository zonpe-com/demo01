/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: UserMapper
 *Auther: Administrator
 *Date: 2020/6/14 20:03
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.mapper;

import com.zp.model.User;
import com.zp.pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User findUserById(int id);
    public List<User> findUserByName(String name);
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> findUserByUserQueryVO(UserQueryVO userQueryVO);
    public List<User> findUserByMap(Map<String,String> map);
    public int userCount();

    public List<User> findUserByUser(UserQueryVO auser);
    public List<User> findUserByIds(UserQueryVO auser);
    public List<User> findUserByIdList(List<Integer> list);
}
