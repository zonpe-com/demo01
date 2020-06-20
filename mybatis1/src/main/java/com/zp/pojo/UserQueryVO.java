/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: UserVO
 *Auther: Administrator
 *Date: 2020/6/15 14:48
 *Description: 查询包装类
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zp.pojo;

import com.zp.model.User;

import java.util.List;

public class UserQueryVO {
    private User user;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
