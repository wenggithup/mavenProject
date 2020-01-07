package FinalTest.login;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Login login=new Login();
        OutputStream ot;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        login.setName(sc.next());
        System.out.println("请输入密码");
        login.setPassword(sc.next());
        Socket socket=new Socket("192.168.11.0",12345);
        ot= socket.getOutputStream();
        ObjectOutputStream os=new ObjectOutputStream(ot);
        os.writeObject(login);
        ot.flush();

        ot.close();
    }
}
