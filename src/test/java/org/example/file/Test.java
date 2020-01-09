package org.example.file;

import com.sun.tools.corba.se.idl.StructEntry;

public class Test {
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }

        try {
            return;
        } finally {
            System.out.println("Finally");
        }
    }
}
