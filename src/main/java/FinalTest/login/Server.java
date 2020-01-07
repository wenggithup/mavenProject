package FinalTest.login;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(12345);
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            ObjectInputStream os=new ObjectInputStream(is);
            Object object= os.readObject();
            Login login=(Login) object;

            if (login.getName().equals("bjsxt")) {
                if(login.getPassword().equals("bjsxt")){
                    System.out.println("登陆成功");
                }else {
                    System.out.println("登陆失败");
                }
            } else {
                System.out.println("登陆失败");
            }

        }
    }
    }

