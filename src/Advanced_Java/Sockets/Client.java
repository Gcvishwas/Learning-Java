package Advanced_Java.Sockets;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // 1. Open socket
            socket = new Socket(host, port);
            System.out.println("Connected to server.");

            // 2. Get input and output streams
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // 3. Read from and write to socket
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                // Read from console and send to server
                clientMessage = console.readLine();
                if (clientMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Client exiting...");
                    break;
                }
                out.println(clientMessage);

                // Read from server
                if ((serverMessage = in.readLine()) != null) {
                    System.out.println("Server: " + serverMessage);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. Close streams and socket
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
