package banyuan.com.Reflect.JdbcReflect.NotStaiticAgency;

import java.lang.reflect.Proxy;

public class TestCase1 {
    public static void main(String[] args) {
        case1 c=new PersonCase1Impl();
        Case1Proxy cp=new Case1Proxy(c);
        //映射接口，用接口对象来接收，参数，classload，接口地址，映射对象
       case1 ob= (case1)Proxy.newProxyInstance(c.getClass().getClassLoader(),c.getClass().getInterfaces(),cp);
        ob.submit("张三");

    }
}
