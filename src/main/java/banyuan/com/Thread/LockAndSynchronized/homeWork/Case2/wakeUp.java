package banyuan.com.Thread.LockAndSynchronized.homeWork.Case2;

public class wakeUp implements Runnable {
    @Override
    public void run() {
        notifyAll();
    }
}
