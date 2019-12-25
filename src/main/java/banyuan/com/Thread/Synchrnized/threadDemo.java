package banyuan.com.Thread.Synchrnized;

public class threadDemo implements Runnable {
    int TICKET=50;
    @Override
    public void run() {
            boolean FLAG=true;
            while (FLAG) {
                synchronized (threadDemo.class) {
                if (TICKET > 0) {
                    try {
                        Thread.sleep((int) (Math.random() * 1000) + 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + TICKET--);
                } else {
                    FLAG = false;
                }

            }
        }
    }
}
