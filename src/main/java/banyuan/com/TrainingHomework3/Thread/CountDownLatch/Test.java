package banyuan.com.TrainingHomework3.Thread.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(5);
        for (int i = 0; i <countDownLatch.getCount() ; i++) {
            new Thread(new MyThread(countDownLatch),"play"+i ).start();

        }
        System.out.println("正在等待所有玩家准备好");
        countDownLatch.await();
        System.out.println("开始游戏");
    }
}
