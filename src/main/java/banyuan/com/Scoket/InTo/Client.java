package banyuan.com.Scoket.InTo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.11.0",12345);
        OutputStream ot=socket.getOutputStream();
        ot.write("大家好才是真的好".getBytes());
        ot.flush();
        ot.close();
    }
}
