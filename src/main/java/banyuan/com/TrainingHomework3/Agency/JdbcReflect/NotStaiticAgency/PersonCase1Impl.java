package banyuan.com.TrainingHomework3.Agency.JdbcReflect.NotStaiticAgency;

public class PersonCase1Impl implements case1 {
    @Override
    public void submit(String str) {
        System.out.println("提交了证据。。。"+str);
    }

    @Override
    public void depend() {
        System.out.println("法庭正在辩护。。。");
    }
}
