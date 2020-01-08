package banyuan.com.TrainingHomework3.BadMash;
/**
 * 线程不安全的懒汉模式
 **/
public class lazyBones {
    private static  lazyBones lazyBones=null;
    private lazyBones() {
    }
    public static lazyBones getLazyBones(){
        if(lazyBones==null){
            lazyBones=new lazyBones();
        }
        return lazyBones;
    }


}
