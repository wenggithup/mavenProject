package banyuan.com.JDBC.Mvc.service.Impl;

import banyuan.com.JDBC.Mvc.dao.Impl.UserDaoImpl;
import banyuan.com.JDBC.Mvc.dao.UserDao;
import banyuan.com.JDBC.Mvc.pojo.User;
import banyuan.com.JDBC.Mvc.service.UserService;
import banyuan.com.JDBC.Mvc.util.DbUtil;

import java.sql.SQLException;
import java.sql.Savepoint;

public class UserServiceImpl implements UserService {
    //定义全局变量

    UserDao userDao = new UserDaoImpl();//调用接口方法，在业务层可添加判断模块，或比较少用的功能

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);

    }

    @Override
    public void delUser(String name) {
        //可先做条件判断
        if (getByName(name)) {
            userDao.delUser(name);
        } else {
            System.out.println("暂无此人");
        }


    }

    @Override
    public void updateUser(String name, int age, int id) {
        userDao.updateUser(name, age, id);
        System.out.println("更新信息成功");

    }

    @Override
    public User selectUser(String name) {
        return userDao.selectUser(name);

    }

    @Override
    public boolean getByName(String name) {
        boolean result = true;
        if (userDao.getByName(name)) {
            System.out.println("数据库中有此人");
            result = true;
        } else {
            System.out.println("数据库没有此人");
            result = false;
        }
        return result;

    }

    @Override
    public void updateMoney(String name, double money, String uname){
        Savepoint A = null;
        Savepoint B = null;
        try {
            DbUtil.con.setAutoCommit(false); //事物处理必须同一个连接
            A = DbUtil.con.setSavepoint("A");
            System.out.println(A.getSavepointName());
            userDao.updateMoney(name, -money);
            B = DbUtil.con.setSavepoint("B");
            System.out.println(B.getSavepointName());
            userDao.updateMoney(uname, money);

            System.out.println(1 / 0);

            DbUtil.con.commit();
        } catch (Exception e) {
            try {
                DbUtil.con.rollback(A);
                DbUtil.con.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }finally {
            DbUtil.closeDb();
        }
        }
    }

