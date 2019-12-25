package banyuan.com.Thread.HomeWork.Case1;

public class threadNum implements Runnable {
        int NUM=200;
        @Override
        public void run() {
            //  有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
            boolean FLAG=true;
            while (FLAG){
                synchronized(this) {
                    if (NUM <=400) {
                        if (NUM %2== 1) {
                            System.out.println("线程"+Thread.currentThread().getName() +"得到"+ NUM++);
                        } else {
                            System.out.println(NUM++); ;
                        }
                    } else {
                        FLAG = false;
                    }
                }
            }
    }
}
