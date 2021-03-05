import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class NetworkServerMain {
    public static void main(String args[]) throws IOException {
        int port = 8000;
        ServerSocket sSocket = new ServerSocket(port);
        Socket socket = sSocket.accept();

        String IP = socket.getInetAddress().toString();
        Date date = new Date();

        System.out.println("Your IP address: " + IP);
        System.out.println("Current date and time: " + date.getTime());
    }
}
