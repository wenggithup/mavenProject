package banyuan.com.Genericity.HomeWork;

import apple.laf.JRSUIUtils;

import java.util.*;

public class Dao<T> {
    Map<String,T> map=new HashMap();
    public void save(String id,T entity) {// 保存T乐行的对象到map集合中
        if(map.containsKey(id)){
            System.out.println("集合中已经有该元素，请重新插入");
        }else {
            map.put(id,entity);
        }

    }
    public T get(String id) {//从map中获取id对应的对象

        return map.get(id);

    }
    public  void update(String id,T entity) {// 替换map中的key为id的内容
        if(map.containsKey(id)) {
            map.put(id, entity);
        }else {
            System.out.println("集合中没有该key值");
        }
    }
    public List<T> list()  {//返回map中所有的 T 对象
        List <T>list1=new ArrayList<>();
       Set set=map.keySet();
        for (Object ob:set) {
            list1.add(map.get(ob));
        }
        return list1;

    }
    public  void delete(String id) {//删除指定对象
        map.remove(id);
    }

}
