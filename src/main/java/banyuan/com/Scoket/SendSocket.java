package banyuan.com.Scoket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SendSocket {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds=new DatagramSocket(1234);
            while (true) {
                byte[] by = new byte[1024];
                DatagramPacket dp = new DatagramPacket(by, by.length);
                ds.receive(dp);
                String s = new String(by, 0, dp.getLength());
                System.out.println(s);
                //ds.close();
            }





    }
}
