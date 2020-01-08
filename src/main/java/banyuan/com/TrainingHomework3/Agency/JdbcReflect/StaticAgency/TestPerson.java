package banyuan.com.TrainingHomework3.Agency.JdbcReflect.StaticAgency;

public class TestPerson {
    public static void main(String[] args) {
        //静态代理是已经知道目标对象
    Person p=new PersonImpl();
    PersonCar p1=new PersonCar(p);
    p1.bycar();
    }
}
