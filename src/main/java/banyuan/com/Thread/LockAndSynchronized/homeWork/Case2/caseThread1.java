package banyuan.com.Thread.LockAndSynchronized.homeWork.Case2;

public class caseThread1 implements Runnable{
    Num num;

    public caseThread1(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        synchronized (num) {
            while (num.flag) {
                num.notify();
                System.out.println(Thread.currentThread().getName() + "i在+++++++：" );
                num.flag=false;
                try {
                    num.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
