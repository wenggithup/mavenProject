package banyuan.com.Reflect.JdbcReflect.StaticAgency;

public class PersonCar implements Person {
    int money=50000000;
    private Person p;
    public PersonCar(Person person) {
        this.p=person;
    }

    @Override
    public void bycar() {
        if(money>500000){
            System.out.println("买得起，不差钱");
        }
        else {
            System.out.println("暂时手头紧");
        }
    }
}
