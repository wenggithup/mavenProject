package banyuan.com.Reflect;

public class Demo1 {
    public static void main(String[] args) {
        try {
            Class classa=Class.forName("class banyuan.com.Reflect.Person");
            System.out.println(classa.getName());;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
