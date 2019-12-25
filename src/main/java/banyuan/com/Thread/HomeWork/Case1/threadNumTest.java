package banyuan.com.Thread.HomeWork.Case1;

public class threadNumTest {
    //  有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
    public static void main(String[] args) {
        threadNum th=new threadNum();
        Thread thread1=new Thread(th,"A");
        Thread thread2=new Thread(th,"B");
        Thread thread3=new Thread(th,"C");
        thread1.start();
        thread2.start();
        thread3.start();


    }

    }

