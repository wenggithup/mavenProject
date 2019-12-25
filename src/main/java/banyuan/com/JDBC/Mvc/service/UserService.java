package banyuan.com.JDBC.Mvc.service;

import banyuan.com.JDBC.Mvc.pojo.User;

import java.sql.SQLException;

public interface UserService {
    void insertUser(User user);//插入用户对象

    void delUser(String name);//根据姓名删除该用户

    void updateUser(String name,int age,int id);//根据用户姓名更新信息

    User selectUser(String name);//根据姓名返回用户对象

    boolean getByName(String name);//根据姓名查询是否出现在数据库中

    void updateMoney (String name ,double money,String uname);//根据姓名转账

}
