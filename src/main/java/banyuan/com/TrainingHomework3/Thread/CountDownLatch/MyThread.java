package banyuan.com.TrainingHomework3.Thread.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread{
    private CountDownLatch countDownLatch;
    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        int i=(int)(Math.random()*3000);
        try {
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName()+"准备就绪");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
