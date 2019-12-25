package banyuan.com.Thread.LockAndSynchronized;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockThread {
    private Lock lock=new ReentrantLock();
    public void Lock(Thread thread) throws InterruptedException {
       // if(lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
        lock.lock();
            try {
                System.out.println(thread.getName() + "锁进来了");
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                System.out.println(thread.getName()+"发生了异常，锁释放了");
                lock.unlock();
            }finally {
                System.out.println(thread.getName()+"执行完，锁释放了");
                //lock.unlock();

            }

        }
   // }
}
