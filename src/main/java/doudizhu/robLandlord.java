package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class robLandlord {
    public static int method() throws InterruptedException {
        List <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.shuffle(list);
        int play;
        for (int i = 0; i <3 ; i++) {
           play= list.get(i);
            Thread.sleep(1000);
            System.out.println("玩家"+play+" 抢地主");
        }
        Thread.sleep(1000);
        System.out.println("玩家"+list.get(0)+" 抢地主！！"+"我抢！！");
        Thread.sleep(2000);
        System.out.println("-------系统提示！！玩家"+list.get(0)+"成为地主-------");
        return list.get(0);
    }
}
