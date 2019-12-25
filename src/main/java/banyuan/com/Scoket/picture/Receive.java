package banyuan.com.Scoket.picture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Receive {
    public static void main(String[] args) throws IOException {
        File file=new File("student.jpg");
        byte []by=new byte[47409];
        OutputStream ot=new FileOutputStream(file);
        ServerSocket ss=new ServerSocket(3213);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        is.read(by);
        is.close();
        ot.write(by);
        ot.flush();
        ot.close();

    }
}
