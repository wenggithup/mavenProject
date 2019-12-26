package banyuan.com.Genericity.Number;

public class Num <T extends Number> {
    private T [] array;
   // 第二题.定义泛型类，成员变量是Number类或其子类对象的数组，成员方法有：求数组元素最小值、最大值和平均值。创建泛型类对象，分别求Integer和Double型数组的最小
  //  最大、平均值
    public Num(T[] array) {
        this.array = array;
    }
    public void getMax(){
        T max=array[0];
        for (int i = 0; i <array.length; i++) {
            if(array [i].toString().compareTo(max.toString())>0){
                max=array[i];
            }
        }
        System.out.println("最大值为"+max);
    }
    public void getMin(){
        T min=array[0];
        for (int i = 0; i <array.length; i++) {
            if(array [i].toString().compareTo(min.toString())<0){
                min=array[i];
            }
        }
        System.out.println("最小值为："+min);
    }
    public void getAverage(){
        double sum=0;
        double average=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i].doubleValue();
        }
        average=sum/array.length;
        System.out.println("平均值为："+average);
    }

}
