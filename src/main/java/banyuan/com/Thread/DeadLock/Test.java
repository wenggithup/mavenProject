package banyuan.com.Thread.DeadLock;

public class Test {
    public static void main(String[] args) {
        myThread t1=new myThread("张三",true);
        myThread t2=new myThread("李四",false);
        t1.start();
        t2.start();

    }
}
