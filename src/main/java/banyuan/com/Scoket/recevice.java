package banyuan.com.Scoket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class recevice {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        String s =null;
            while (true){
                System.out.println("请输入");
                s=sc.nextLine();
                if(s.equals("886")) {
                    break;
                }else {
                    InetAddress ip = InetAddress.getByName("192.168.11.0");
                    DatagramPacket dp = new DatagramPacket(s.getBytes(), s.getBytes().length, ip, 1234);
                    socket.send(dp);
                }


            }

            }
        }


