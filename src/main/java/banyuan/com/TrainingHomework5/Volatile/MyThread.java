package banyuan.com.TrainingHomework5.Volatile;

public class MyThread implements Runnable{
    volatile boolean flag=false;
    @Override
    public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("flag="+flag);
            flag=true;
        }


    public boolean isFlag() {
        return flag;
    }
}
