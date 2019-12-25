package banyuan.com.Thread.LockAndSynchronized.homeWork.Case2;

public class case2Test {
    public static void main(String[] args) throws InterruptedException {
        Num num=new Num();
        caseThread1 c1=new caseThread1(num);
        caseThread2 c2=new caseThread2(num);
        Thread t1=new Thread(c1,"我是t1");
        Thread t2=new Thread(c1,"我是t2");
        Thread t3=new Thread(c2,"我是t3");
        Thread t4=new Thread(c2,"我是t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
