### 分别写出一个静态代理和动态代理案例,并且对比一下两者的不同
###jdbc 静态代理：只针对接口，并且代理对象已知。代理类直接继承接口
###     动态代理：未知的代理对象，代理类继承InvocationHandler接口，添加额外功能要在
###     使用InvocationHandler自带的method方法之前。
###Cglib代理：既可以用于接口，也可以用于正常类；继承继承MethodInterceptor方法，且额外
###         功能要在继承MethodInterceptor自带 的method方法之前