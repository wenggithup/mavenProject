package banyuan.com.Reflect.CglibReflect;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {//继承MethodInterceptor
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这是对目标增强，不是用反射");
        int x=100;
        if(x>1000){
            System.out.println("还能买得起狗粮");
        }else {
            System.out.println("买不起狗粮l ");

        }
        //调用方法，用对像来接收，放入对象，对象数组
        Object ob=methodProxy.invokeSuper(o,objects);

        return ob;
    }
}
