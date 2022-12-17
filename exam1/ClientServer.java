import java.io.*;
import java.net.*;

public class ClientServer {
    public static void startClient() {
        try {
            Socket socket = new Socket("127.0.0.1", 8000);

            String charset = "UTF-8";

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), charset));

            output.write("Tver");
            output.newLine();
            output.flush();

            System.out.println(input.readLine());

            socket.close();
            output.close();
            input.close();
        } catch (Exception e) {
            System.out.println("Blin, oshipka (((");
        }
    }

    public static void main(String[] args) {
        startClient();
    }
}