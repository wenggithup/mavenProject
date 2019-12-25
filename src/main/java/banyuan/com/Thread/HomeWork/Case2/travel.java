package banyuan.com.Thread.HomeWork.Case2;

public class travel implements Runnable{
    int i=1;
    @Override

    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "顺序" + i++);
        }
    }
    //现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人
    //,每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名

}
