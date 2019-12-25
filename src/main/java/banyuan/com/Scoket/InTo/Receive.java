package banyuan.com.Scoket.InTo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {
        File file=new File("student.csv");
        ServerSocket serverSocket=null;
        serverSocket=new ServerSocket(12345);
        Socket ss=serverSocket.accept();
        InputStream is= ss.getInputStream();
        byte []by=new byte[1024];
        int len=is.read(by);
        String s=new String(by,0,len);
        System.out.println(s);

    }
}
