package banyuan.com.JDBC.Mvc.dao.Impl;

import banyuan.com.JDBC.Mvc.dao.UserDao;
import banyuan.com.JDBC.Mvc.pojo.User;
import banyuan.com.JDBC.Mvc.util.DButil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Connection con=null;
    PreparedStatement ps;
    List list;
    @Override
    public void insertUser(User user) {
    String sql="insert into user (uid,uname,uage) values (?,?,?)";
        try {
            con= DButil.connect();//获取数据库连接
            ps=con.prepareStatement(sql);//将sql语句注入预处理
            ps.setInt(1,user.getUid());//设置第一行的值
            ps.setString(2,user.getUname());//设置第二行的值
            ps.setInt(3,user.getUage());//设置第三行得值
            int  result =ps.executeUpdate();//更新结果集
            if(result>0){//判断是否更新成功
                System.out.println("插入成功");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeDb();
        }

    }

    @Override
    public void delUser(String name) {
        String sql="delete from user where uname=?";
        con=DButil.connect();//获取连接
        try {
         ps=   con.prepareStatement(sql);//注入sql语句预处理
         ps.setString(1,name);
         int i= ps.executeUpdate();
         if(i>0){
             System.out.println("删除成功");
         }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeDb();
        }

    }

    @Override
    public void updateUser(String name ,int age,int id) {

        String sql="update user set uage=?,uid=? where uname=?";
        con=DButil.connect();
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,age);
            ps.setInt(2,id);
            ps.setString(3,name);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeDb();
        }

    }

    @Override
    public User selectUser(String name) {
        User user=new User();
        String sql="select * from user where uname=?";
        con=DButil.connect();
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                user.setUid(rs.getInt(1));
                user.setUname(rs.getString(2));
                user.setUage(rs.getInt(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeDb();
        }

        return user;
    }
    @Override
    public boolean getByName(String name) {
        String sql = "select * from user where uname=?";
        con = DButil.connect();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,name);
           ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return  true;
            }else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DButil.closeDb();
        }
        return false;
    }

    @Override
    public void updateMoney(String name, double money) {
        String sql="update  user set money=money+? where uname=?";
        con=DButil.connect();
        try {
            ps=con.prepareStatement(sql);
            ps.setDouble(1,money);
            ps.setString(2,name);
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println(name+"转账了"+money);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //DButil.closeDb();
        }

    }
}
