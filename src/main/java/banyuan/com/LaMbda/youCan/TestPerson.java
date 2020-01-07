package banyuan.com.LaMbda.youCan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestPerson {
    public static void main(String[] args) {
    /*    Person []person={
                        new Person("玛尔扎哈",30),
                        new Person("柳岩",19),
                        new Person("迪丽热巴",20),
                        new Person("古力娜扎",30),


        };
        *//*Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*//*
        Arrays.sort(person,(Person o1, Person o2)->{return o1.getAge()-o2.getAge();});
        for (Person person1 : person) {
            System.out.println(person1.toString());
        }*/
       Consumer<String> con=(x)-> System.out.println(x+"我利亚克痛");
       con.accept("1sdasd5");
        Supplier <Integer> supplier=()->55*22;
        System.out.println(supplier.get());
    }


}
