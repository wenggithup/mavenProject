package banyuan.com.Scoket.picture;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws IOException {
        File file=new File("22.jpg");
        InputStream is=new FileInputStream(file);
        byte []by=new byte[47409];
        is.read(by);
        Socket socket=new Socket("192.168.11.0",3213);
        OutputStream ot=socket.getOutputStream();
        is.close();
        ot.write(by);
        ot.flush();
        ot.close();
        socket.close();

    }
}
