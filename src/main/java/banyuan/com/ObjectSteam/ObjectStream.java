package banyuan.com.ObjectSteam;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("张三","南京",75.0);
        Person person=new Person("lisi","上海",15);
        File file =new File("a.txt");
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(file,true));
        obj.writeObject(student);
        ///obj.writeObject(person);
        obj.flush();
        obj.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        Object s= objectInputStream.readObject();
        while(s!=null){
           try {
               if(s instanceof Student){
                   Student student1=(Student)s;
                   System.out.println(student1.toString());
               }else{
                   Person person1=(Person)s;
                   System.out.println(person1.toString());
               }
               s= objectInputStream.readObject();
           }catch (Exception e){
               System.out.println("sasjajosjo");
               break;
           }
        }
        objectInputStream.close();






    }
}
