package banyuan.com.Thread.Synchrnized;

public class testThreadDemo {
    public static void main(String[] args) {
        threadDemo threadDemo=new threadDemo();
        Thread thread1=new Thread(threadDemo,"窗口A");
        Thread thread2=new Thread(threadDemo,"窗口B");
        Thread thread3=new Thread(threadDemo,"窗口C");
        Thread thread4=new Thread(threadDemo,"窗口D");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
