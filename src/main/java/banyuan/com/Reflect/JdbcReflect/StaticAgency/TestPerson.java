package banyuan.com.Reflect.JdbcReflect.StaticAgency;

public class TestPerson {
    public static void main(String[] args) {
    Person p=new PersonImpl();
    PersonCar p1=new PersonCar(p);
    p1.bycar();
    }
}
