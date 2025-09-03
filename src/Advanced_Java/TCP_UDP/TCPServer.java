package Advanced_Java.TCP_UDP;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5000; // server port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("TCP Server started. Waiting for client...");

            Socket socket = serverSocket.accept(); // accept client connection
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message = in.readLine();
            System.out.println("Received from client: " + message);

            out.println("Hello from TCP Server! You said: " + message);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
