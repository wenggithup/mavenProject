package org.example.file;

import banyuan.com.JDBC.Mvc.pojo.User;
import banyuan.com.JDBC.Mvc.service.Impl.UserServiceImpl;
import banyuan.com.JDBC.Mvc.service.UserService;

import java.sql.SQLException;

public class TestUser {
    public static void main(String[] args) throws SQLException {
//        User user=new User(7,"钱老三1",15);
//        User user2=new User(8,"钱老三2",16);
//        User user3=new User(9,"钱老三3",17);/*
//        User user4=new User(10,"钱老三4",18);
//        User user5=new User(11,"钱老三5",19);
//        User user6=new User(12,"钱老三6",20);
        // User user1=new User(13,"张三",25);
        UserService userService=new UserServiceImpl();//调用接口方法
//        userService.insertUser(user6);//测试插入功能
        //userService.delUser("周七");
        //userService.getByName("前三");//测试根据姓名查询数据库是否由此人
        //userService.getByName("张三");
        //userService.updateUser("张三",25,10);//更新信息，原信息为1，张三，15
        //User a1=userService.selectUser("张三");//测试查询信息
       // System.out.println(a1.toString());
        userService.updateMoney("张三",200.0,"李四");
    }
}
