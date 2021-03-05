import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServerMain {
    public static void main(String args[]) throws IOException {
        int port = 8000;
        ServerSocket sSocket = new ServerSocket(port);
        Socket socket = sSocket.accept();

        

    }
}
