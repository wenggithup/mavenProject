package banyuan.com.TrainingHomework3.BadMash;

/**
 * 线程安全的懒汉模式
 * 第一个线程进来判断 sl == null，还没有new 出实例的时候 。
 * 这个时候第二个线程也进来了，sl 也是 null，然后也会 new 出实例的，
 * 这样就不是单例模式了
 **/

public class synchrnoizedLazyBones {
    private  static  synchrnoizedLazyBones sl=null;
    private synchrnoizedLazyBones() {
    }

    public static synchrnoizedLazyBones getSynchrnoizedLazyBones() {
        if(sl == null){
            synchronized (synchrnoizedLazyBones.class) {
                if (sl == null) {
                    sl = new synchrnoizedLazyBones();
                }
            }
        }


        return sl;
    }
}
