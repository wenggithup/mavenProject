package banyuan.com.Thread.LockAndSynchronized;

public class TestLock {
    public static void main(String[] args) {
         final lockThread lockThread = new lockThread();
         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockThread.Lock(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"线程A");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockThread.Lock(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"线程B");
        thread.start();
        thread.interrupt();
        thread1.start();
    }
}