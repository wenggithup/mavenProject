package banyuan.com.Genericity.HomeWork.Number;

public class TestNum {
    public static void main(String[] args) {
        Num<Integer> num=new Num(new Integer[]{1, 3, 5, 7, 7, 9});
        Num<Double> num1=new Num<>(new Double[]{1.1,1.2,1.3,1.4,1.5,1.6});
        num.getAverage();num.getMax();num.getMin();
        num1.getMin();;num1.getMax();num1.getAverage();
    }
}
