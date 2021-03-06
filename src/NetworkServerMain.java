import java.io.IOException;
import java.io.PrintWriter;
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
        PrintWriter out = new PrintWriter(socket.getOutputStream());


        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: text/html");
        out.println("\r\n");
        out.println("<p> Your IP address: </p>" + IP);
        out.println("<p> Current date and time: </p>" + date.toString());
        out.flush();
        out.close();
    }
}
