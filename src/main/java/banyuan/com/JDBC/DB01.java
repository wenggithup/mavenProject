package banyuan.com.JDBC;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.sql.*;

public class DB01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=null;
        //1。加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2。使用驱动管理工具，获取连接 url（数据库的地址+表名），user（数据库名），password（数据库密码）
        String url="jdbc:mysql://localhost:3306/weng?useSSL=false";
        con=DriverManager.getConnection(url,"root","");
        if(con!=null) {
            con.isClosed();
        }
        Statement statement=con.createStatement();//专门对sql语句进行处理
        String sql="select *from user";//获取处理之后的结果集
        ResultSet resultSet=statement.executeQuery(sql);
        //System.out.println(resultSet.next());
        while(resultSet.next()){

        }

    }
}
