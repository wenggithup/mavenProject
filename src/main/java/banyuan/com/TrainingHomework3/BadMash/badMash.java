package banyuan.com.TrainingHomework3.BadMash;

/**
 * 饿汉模式
 */

public class badMash {
    private badMash() {
    }
    private static final badMash badmash=new badMash();

    public static badMash getBadmash() {
        return badmash;
    }
}
