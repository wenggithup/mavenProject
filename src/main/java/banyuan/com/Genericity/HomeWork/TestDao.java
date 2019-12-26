package banyuan.com.Genericity.HomeWork;

import java.util.HashMap;

public class TestDao {
    public static void main(String[] args) {
        Dao dao=new Dao();
        dao.map.put("张三",17);
        dao.map.put("张三1",18);
        dao.map.put("张三2",19);
        dao.map.put("张三3",111);
        dao.map.put("张三4",12);
        dao.map.put("张三5",15);
        dao.map.put("张三6",11);
        System.out.println(dao.map);//{张三=17, 张三5=15, 张三6=11, 张三3=111, 张三4=12, 张三1=18, 张三2=19}
        dao.delete("张三");
        System.out.println(dao.map);//{张三5=15, 张三6=11, 张三3=111, 张三4=12, 张三1=18, 张三2=19}
        System.out.println(dao.list());//[15, 11, 111, 12, 18, 19]
        System.out.println(dao.get("张三2"));;//19
        dao.save("张三15",119);
        System.out.println(dao.map);//{张三5=15, 张三6=11, 张三3=111, 张三4=12, 张三1=18, 张三2=19, 张三15=119}
        dao.update("张三2",15);
        System.out.println(dao.map);//{张三5=15, 张三6=11, 张三3=111, 张三4=12, 张三1=18, 张三2=15, 张三15=119}
        dao.update("张三999",22);//集合中没有该key值



    }
}
