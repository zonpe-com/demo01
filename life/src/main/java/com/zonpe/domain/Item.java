/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Item
 *Auther: Administrator
 *Date: 2020/6/10 6:32
 *Description: DTO对象
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */
package com.zonpe.domain;


import java.util.Date;

public class Item {
    private Integer id;
    private String name;
    private Date starttime;
    private Date inserttime;

    public Item() {
    }

    public Item(Integer id, String name, Date starttime, Date inserttime) {
        this.id = id;
        this.name = name;
        this.starttime = starttime;
        this.inserttime = inserttime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starttime=" + starttime +
                ", inserttime=" + inserttime +
                '}';
    }
}
