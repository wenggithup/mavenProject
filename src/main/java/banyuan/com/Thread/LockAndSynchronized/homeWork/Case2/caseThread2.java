package banyuan.com.Thread.LockAndSynchronized.homeWork.Case2;

public class caseThread2 implements Runnable {
    Num num;
    public caseThread2(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        synchronized (num) {
            while (!num.flag) {
            num.notify();
            System.out.println(Thread.currentThread().getName() + "i-------：" );
            num.flag=true;
            try {
                num.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    }
}
