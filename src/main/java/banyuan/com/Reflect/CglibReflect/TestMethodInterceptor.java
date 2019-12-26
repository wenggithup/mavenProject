package banyuan.com.Reflect.CglibReflect;

import net.sf.cglib.proxy.Enhancer;

public class TestMethodInterceptor {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();//创建Enhancer对象，类似于jdk的Proxy类
        //设置目标的字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //Dog对象接收
        Dog dog= (Dog)enhancer.create();
        dog.eat("💩");
        dog.run();

    }

}
