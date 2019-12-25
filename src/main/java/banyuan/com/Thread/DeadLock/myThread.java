package banyuan.com.Thread.DeadLock;

public class myThread extends Thread {
    private boolean FLAG;
    public myThread(String name,boolean FLAG) {
        super(name);
        this.FLAG=FLAG;
    }

    @Override
    public void run() {
        if(FLAG){
            synchronized (deadLock.objectA){
                System.out.println(Thread.currentThread().getName()+"拿走了");
                synchronized (deadLock.objectB){
                    System.out.println(Thread.currentThread().getName()+"拿走了");
                }
            }


        }else {
            synchronized (deadLock.objectB){
                System.out.println(Thread.currentThread().getName()+"拿走了");
                synchronized (deadLock.objectA){
                    System.out.println(Thread.currentThread().getName()+"拿走了");
                }
            }


        }
    }
}
