package banyuan.com.Thread.LockAndSynchronized.homeWork;

public class case1Test {
    public static void main(String[] args) throws InterruptedException {
        case1 c=new case1();
        Thread t1=new Thread(c,"我叫A");
        Thread t2=new Thread(c,"我叫B");
        Thread t3=new Thread(c,"我叫C");
        Thread t4=new Thread(c,"我叫D");

            t1.start();
            t1.join();
            t2.start();
            t1.join();
            t3.start();
            t1.join();
            t4.start();
        }


}
