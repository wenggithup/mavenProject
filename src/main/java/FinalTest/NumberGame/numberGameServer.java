package FinalTest.NumberGame;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class numberGameServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        int in =(int)(Math.random()*51);


            try {
                serverSocket = new ServerSocket(7890);
                while (true){
                    System.out.println("随机数是："+in);
                    Socket ss=serverSocket.accept();
                    System.out.println("我是吱吱");
                    InputStream is= ss.getInputStream();
                    byte []by=new byte[1024];
                    int len=is.read(by);
                    String s=new String(by,0,len);
                    System.out.println(s);
                    int result= s.compareTo(String.valueOf(in));
                        if(result>0){
                            System.out.println("大了,心眼大了");
                        }else if(result<0){
                            System.out.println("小了，格局小了");
                        }else {
                            System.out.println("恭喜你猜对了");
                        }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



}
