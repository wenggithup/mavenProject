package banyuan.com.JDBC.Mvc.util;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @author edz
 */
public class DbUtil {
   public  static Connection con = null;

   static {
       String driver = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/weng?useSSL=false";
       String user = "root";
       String password = "";
       try {
           Class.forName(driver);
           con=DriverManager.getConnection(url,user,password);
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
       }
   }

    public static void closeDb(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
