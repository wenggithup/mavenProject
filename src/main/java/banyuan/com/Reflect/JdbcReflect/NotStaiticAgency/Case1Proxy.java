package banyuan.com.Reflect.JdbcReflect.NotStaiticAgency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Case1Proxy implements InvocationHandler {//动态代理要继承InvocationHandler类
    private Object object;

    public Case1Proxy(Object obj) {
        this.object = obj;
    }//有参构造，将目标对象实例对象传过来


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是静态代理");
        //主要作用是在调用目标方法之前增加其它功能
        method.invoke(object,args);
        return null;
    }
}
