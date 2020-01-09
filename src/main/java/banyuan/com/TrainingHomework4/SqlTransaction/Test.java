package banyuan.com.TrainingHomework4.SqlTransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Test {
    public void updateMoney2() throws SQLException {
        Connection db=DbUtil.con;
        String sql="update user set money=money+100  where uname=?";
        PreparedStatement ps = db.prepareStatement(sql);
        ps.setString(1,"张三");
        ps.executeUpdate();

    }

    public static void main(String[] args) throws SQLException {
        Acount a=new Acount();
        Test t=new Test();
        a.updateMoney();
        t.updateMoney2();
    }
}
