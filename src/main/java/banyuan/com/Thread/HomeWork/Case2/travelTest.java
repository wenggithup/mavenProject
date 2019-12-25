package banyuan.com.Thread.HomeWork.Case2;

public class travelTest {
    public static void main(String[] args) {
        travel t=new travel();
        Thread person1=new Thread(t,"第一个人");
        Thread person2=new Thread(t,"第二个人");
        Thread person3=new Thread(t,"第三个人");
        Thread person4=new Thread(t,"第四个人");
        Thread person5=new Thread(t,"第五个人");
        Thread person6=new Thread(t,"第六个人");
        Thread person7=new Thread(t,"第七个人");
        Thread person8=new Thread(t,"第八个人");
        Thread person9=new Thread(t,"第九个人");
        Thread person10=new Thread(t,"第十个人");
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
        person8.start();
        person9.start();
        person10.start();
    }
}
