package doudizhu;

import apple.laf.JRSUIUtils;

import java.util.*;

public class other {
    public static void main(String[] args) throws InterruptedException {
        String[] numeber = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥️", "♦️", "♠️", "♣️"};
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        TreeSet<Integer> play1 = new TreeSet<>();
        TreeSet<Integer> play2 = new TreeSet<>();
        TreeSet<Integer> play3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        HashMap<Integer, String> hashMap = new HashMap();
        for (String s : numeber) {
            for (String s2 : colors) {
                hashMap.put(index, s2 + s);
                arrayList.add(index);
                index++;
                //按照顺序塞入hashmap集合中，此处number和color不能互换
            }
        }
        arrayList.add(52);
        arrayList.add(53)    ;
        hashMap.put(52, "小王");
        hashMap.put(53, "大王");
        Collections.shuffle(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            int b=arrayList.get(i);
            if (i > 50) {
                dipai.add(b);
            }  else {
                if (i % 3 == 0) {
                    play1.add(b);
                } else if (i % 3 == 1) {
                    play2.add(b);
                } else {
                    play3.add(b);
                }
            }
        }
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4=new ArrayList() ;

        for (Integer integer : play1) {
            list.add(hashMap.get(integer));
        }
        for (Integer integer : play2) {
            list2.add(hashMap.get(integer));
        }
        for (Integer integer : play3) {

        list3.add(hashMap.get(integer));

    }
        for (Integer integer:dipai){
            list4.add(hashMap.get(integer))     ;
        }
        System.out.println("玩家1的手牌为："+list);
        System.out.println("玩家2的手牌为："+list2);
        System.out.println("玩家3的手牌为："+list3);
        Thread.sleep(1000);
        System.out.println("底牌为："+list4);
        int paly=robLandlord.method();
        ArrayList playa = new ArrayList();
        ArrayList playb = new ArrayList();
        ArrayList playc = new ArrayList();

        if(paly==1){
            for (Integer integer:dipai){
                play1.add(integer);
            }
            for (Integer integer : play1) {
                playa.add(hashMap.get(integer));

            }
            System.out.println("地主1的手牌为："+playa);
            System.out.println("农民2的手牌为："+list2);
            System.out.println("农民3的手牌为："+list3);
        }else if(paly==2){
            for (Integer integer:dipai){
                play2.add(integer);
            }
            for (Integer integer : play2) {
                playb.add(hashMap.get(integer));
            }
            System.out.println("农民2的手牌为："+list);
            System.out.println("地主1的手牌为："+playb);
            System.out.println("农民3的手牌为："+list3);

        }else {
            for (Integer integer:dipai){
                play3.add(integer);
            }
            for (Integer integer : play3) {
                playc.add(hashMap.get(integer));
            }
            System.out.println("农民2的手牌为："+list);
            System.out.println("农民3的手牌为："+list2);
            System.out.println("地主1的手牌为："+playc);
        }


    }

}

