import java.net.*;
import java.io.*;

public class SocketServer {
    public static void startServer() {
        try {
            ServerSocket socket = new ServerSocket(8000);
            Socket connect = socket.accept();

            String charset = "UTF-8";

            BufferedReader input = new BufferedReader(new InputStreamReader(connect.getInputStream(), charset));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream(), charset));

            String message = input.readLine();

            System.out.println(message);

            output.write("x-18=33; x=51");
            output.flush();
            output.close();

            connect.close();

        } catch (Exception e) {
            System.out.println("Blin, oshipka (((");
        }
    }
    
    public static void main(String[] args) {
        startServer();
    }
}