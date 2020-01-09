package banyuan.com.TrainingHomework4.SqlTransaction;

import doudizhu.Collection;

import java.net.DatagramPacket;
import java.sql.*;

public class Acount {

    public void updateMoney() throws SQLException {
        Connection db=DbUtil.con;
        Savepoint A=null;
        try {
            String sql="update user set money=money+100  where uname=?";
            A=DbUtil.con.setSavepoint("A");
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1,"张三");
            System.out.println(1/0);
            ps.executeUpdate();
        }catch (Exception e){
            DbUtil.con.rollback(A);
            DbUtil.con.commit();
        }


    }
}
