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
       method.invoke(object,args);//调用方法，参数实例对象，对象数组
        return null;
    }
}
