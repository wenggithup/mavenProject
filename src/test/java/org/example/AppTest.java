package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public static void main(String[] args) {
        String s1=new String("你好");
        String s2=new String("你好");
        //System.out.print(s1.toString());
        //System.out.println(s1.equals(s2));
        //System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        Integer f1=100,f2=100,f3=150,f4=150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
        //System.out.println(s1 == s2);
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");

    }




    static void pong() {
        System.out.print("pong");
    }
}

