package FinalTest.NumberGame;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class numberGameClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            try {

                for (int i = 0; i < 5; i++) {
                    Socket socket = new Socket("192.168.11.0",7890);
                    System.out.println("请输入数字");
                    String str=sc.next();
                    if(str.equals("quit")){
                        System.out.println("你已退出");
                        break;
                    }
                    OutputStream ot=socket.getOutputStream();
                    ot.write(str.getBytes());
                    System.out.println("您还有"+(4-i)+"次机会");
                    ot.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

}
