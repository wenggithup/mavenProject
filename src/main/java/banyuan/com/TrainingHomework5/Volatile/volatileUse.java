package banyuan.com.TrainingHomework5.Volatile;

public class volatileUse {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        new Thread(myThread).start();

        while (true){
            if(myThread.isFlag()){
                System.out.println("--------");
                break;
            }

        }
    }

}
