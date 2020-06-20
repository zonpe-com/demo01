/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Demo1
 *Auther: Administrator
 *Date: 2020/6/14 19:42
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.test;

import com.zp.mapper.UserMapper;
import com.zp.model.User;
import com.zp.pojo.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Demo1 {
    SqlSession sqlSession;
    UserMapper userMapper;
    @Before
    public void before() throws IOException {
        String resourcre = "SqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resourcre);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        sqlSession.commit();
    }
    //使用xml的id
    @Test
    public void test1(){
        //DriverManager.getConnection()
        User user = sqlSession.selectOne("findUserById",10);
        System.out.println("user = " + user);

    }
    @Test
    public void test2(){
        List<User> objects = sqlSession.selectList("findUserByName", "张");
        System.out.println("objects = " + objects);
    }
    //使用根据接口生成的对象
    @Test
    public void test3(){
        userMapper = sqlSession.getMapper(UserMapper.class);
        User userById = userMapper.findUserById(10);
        System.out.println("userById = " + userById);
        List<User> userL = userMapper.findUserByName("张");
        System.out.println("userL = " + userL);
    }
    @Test
    public void test4(){
        User user = new User();
        user.setAddress("大神在上海");
        user.setBirthday(new Date());
        user.setSex("1");
        //user.setId(27);
        user.setUsername("辉腾");

        User user1 = new User(null, "gyf",  new Date(),"2", "广州");
        //如果mapper的xml里继续使用select标签执行insert语句，通过sqlsession的insert可以执行，但是通过mapper的insert执行就不会提交数据
        userMapper.insertUser(user1);
        userMapper.insertUser(user);
        //sqlSession.insert("insertUser",user1);
    }
    @Test
    public void test5(){
        userMapper.deleteUser(31);
    }
    @Test
    public void test6(){
        User user = new User(32, "长江七号", new Date(), "2", "黄浦江");
        userMapper.updateUser(user);
    }
    @Test
    public void test7(){
        User user = new User(null, "神州九号", new Date(), "1", "怒江");
        int insertUser = sqlSession.insert("insertUser", user);
        System.out.println("受影响的行 = " + insertUser);
        System.out.println("插入后的id = " + user.getId());
    }
    @Test
    public void test8(){
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setId(10);
        userQueryVO.setUser(user);
        List<User> userByUserQueryVO = userMapper.findUserByUserQueryVO(userQueryVO);
        System.out.println("userByUserQueryVO = " + userByUserQueryVO);
    }
    @Test
    public void test9(){
        HashMap<String, String> map = new HashMap<>();
        map.put("username","张");
        //map.put("sex","1");
        List<User> userByMap = userMapper.findUserByMap(map);
        System.out.println("userByMap = " + userByMap);
    }
    @Test
    public void test10(){
        int i = userMapper.userCount();
        System.out.println(i);
    }
    @Test
    public void test11(){
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setSex("2");
        user.setUsername("神州九号");
        userQueryVO.setUser(user);
        List<User> i = userMapper.findUserByUser(userQueryVO);
        System.out.println(i);
    }
    @Test
    public void test12(){
        UserQueryVO userQueryVO = new UserQueryVO();
        List<Integer> list = new ArrayList<Integer>();
        list.add(22);
        list.add(25);
        list.add(33);
        userQueryVO.setIds(list);
        List<User> userByIds = userMapper.findUserByIds(userQueryVO);
        System.out.println("userByIds = " + userByIds);
    }
    @Test
    public void test13(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(35);
        integers.add(36);
        integers.add(37);
        List<User> userByIdList = userMapper.findUserByIdList(integers);
        System.out.println("userByIdList = " + userByIdList);
    }
}
