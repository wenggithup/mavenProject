package banyuan.com.JDBC.Mvc.pojo;

public class User {
    private int uid;//定义与数据库表格相同的变量
    private String uname;
    private int uage;
    private double money;

    public User(int uid, String uname, int uage, double money) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", money=" + money +
                '}';
    }

    public User(int uid, String uname, int uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public User(String uname, int uage) {
        this.uname = uname;
        this.uage = uage;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

}
