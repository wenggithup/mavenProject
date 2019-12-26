package doudizhu;

import apple.laf.JRSUIUtils;

import java.util.*;

public class useCirculation {
    public static void main(String[] args) throws InterruptedException {
        String []numeber={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String []colors={"♥️","♦️","♠️","♣️"};
        int index=0;
        HashMap<Integer,String> hashMap=new HashMap();
        for (String s:numeber) {
            for (String s2:colors) {
                hashMap.put(index++,s+s2);//按照顺序塞入hashmap集合中，此处number和color不能互换
            }
        }
        hashMap.put(52,"小王");//塞入大小王
        hashMap.put(53,"大王");
        Random random=new Random();//创建随机数
        TreeSet play1=new TreeSet();//创建有序唯一Set集合
        TreeSet play2=new TreeSet();
        TreeSet play3=new TreeSet();
        TreeSet dipai=new TreeSet();
        //拿牌逻辑主要由for循环实现，四个玩家都要拿牌，并且拿到牌对应的索引。
            for (int i = 0; i < 54; i++) {
                int j = random.nextInt(54);//定义玩家1的第一张随机手牌
                if(play2.size()<17) {//判断玩家二的集合长度，
                    for (int k = 0; k < 17; k++) {
                        int m = new Random().nextInt(54);//定义玩家二的第一张随机手牌
                        if(play3.size()<17) {//判断玩家三的集合长度
                            for (int l = 0; l < 17; l++) {
                                int x=new Random().nextInt(54);//定义玩家三的第一张手牌
                                if(dipai.size()<3) {//判断底牌的集合长度
                                    for (int n = 0; n < 3; n++) {
                                      int h=new Random().nextInt(54);//定义底牌
                                      if(h!=x||h!=m||h!=j){//判断底牌是否和玩家一/玩家二/玩家三的第一张牌相同
                                          dipai.add(h);//如果不相同，将此牌加入集合中
                                      }
                                      if (dipai.size()>2){
                                          break;     //如果牌大于三张，退出此for循环
                                      }
                                    }
                                }
                                if(x==j||x==m||dipai.contains(x)){
                                    l--;
                                } else {
                                    play3.add(x);
                                }
                                if (play3.size()>16){
                                    break;
                                }
                            }
                        }
                        if (j == m||play3.contains(m)||dipai.contains(m)) {
                            k--;
                        }else {
                            play2.add(m)   ;
                        }
                        if (play2.size()>16) {
                            break;
                        }
                    }
                }
                if(play2.contains(j)||play3.contains(j)||dipai.contains(j)){
                    i--;
                }else {
                    play1.add(j);
                    if (play1.size() < 17) {
                        i--;
                    } else {
                        break;
                    }
                }
            }
            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
        for (Object o:play1) {
             Integer integer=(Integer)o;
             arrayList1.add(hashMap.get(integer));
        }
        for (Object o:play2) {
            Integer integer=(Integer)o;
            arrayList2.add(hashMap.get(integer));
        }
        for (Object o:play3) {
            Integer integer=(Integer)o;
            arrayList3.add(hashMap.get(integer));
        }
        for (Object o:dipai) {
            Integer integer=(Integer)o;
            arrayList4.add(hashMap.get(integer));
        }

        System.out.print("当前底牌为："+arrayList4);
        System.out.println();
        System.out.print("玩家一的手牌是："+arrayList1);
        System.out.println();
        System.out.print("玩家二的手牌是："+arrayList2);
        System.out.println();
        System.out.print("玩家三的手牌是："+arrayList3);
        System.out.println();
        Thread.sleep(2000);
        System.out.println("玩家一：抢地主");
        Thread.sleep(2000);
        System.out.println("玩家二：我抢");
        Thread.sleep(2000);
        System.out.println("玩家三：我抢");
        Thread.sleep(2000);
        System.out.println("玩家一：抢地主，我抢");
        Thread.sleep(100);
        System.out.println("系统提示：玩家一成为地主");
        Thread.sleep(2000);
        System.out.println("补完牌后：");
        for (Object o:dipai) {
            Integer integer=(Integer)o;
            play1.add(integer);
        }
        ArrayList<String> arrayList5=new ArrayList<>();
        for (Object o:play1) {
            Integer integer=(Integer)o;
            arrayList5.add(hashMap.get(integer));
        }
        Thread.sleep(2000);

        System.out.print("地主的手牌是："+arrayList5);
        System.out.println();
        System.out.print("农民一的手牌是："+arrayList2);
        System.out.println();
        System.out.print("农民二的手牌是："+arrayList3);






    }
}
