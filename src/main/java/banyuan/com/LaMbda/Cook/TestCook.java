package banyuan.com.LaMbda.Cook;

public class TestCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void CookFood() {
                System.out.println("厨子在吃饭");
            }
        });

        invokeCook(()->{System.out.println("厨子在吃饭");});

    }
    public static void invokeCook(Cook cook){
        cook.CookFood();
    }
}
