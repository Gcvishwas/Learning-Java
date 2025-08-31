package Advanced_Java.Sockets;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 1234;
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // 1. Create ServerSocket
            serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for client...");

            // 2. Accept connection from client
            socket = serverSocket.accept();
            System.out.println("Client connected.");

            // 3. Get input and output streams
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // 4. Read from and write to socket
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                // Read from client
                if ((clientMessage = in.readLine()) != null) {
                    System.out.println("Client: " + clientMessage);
                }

                // Read from console and send to client
                serverMessage = console.readLine();
                if (serverMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Server exiting...");
                    break;
                }
                out.println(serverMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5. Close streams and sockets
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
                if (socket != null)
                    socket.close();
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
