package banyuan.com.TrainingHomework4.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        //将队列元素放入集合里，并遍历倒序输出
        Queue<String> q1=new LinkedList();
        Queue<String> q2=new LinkedList();
        ArrayList<String> al=new ArrayList();
        String []arr={"a","b","c","d","e","f"};
        System.out.println("入栈");
        for (String s : arr) {
            q1.offer(s);
            System.out.print(s+" ");
        }
        al.addAll(q1);
        System.out.println();
        for (int i =  al.size()-1; i >=0; i--) {
            q2.offer(al.get(i));
        }
        System.out.println("出栈");
        for (String s : q2) {
            System.out.print(s+" ");
        }
        Thread t = new Thread() {
            @Override
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");


    }
    static void pong() {
        System.out.print("pong");
    }

}
