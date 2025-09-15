package Advanced_Java.Sockets;

import java.io.*;
import java.net.*;

public class CircleServer {
    public static void main(String[] args) {
        int port = 5000; // Server port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running on port " + port + "...");

            // Wait for client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Input & Output streams
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Read radius from client
            double radius = dis.readDouble();
            System.out.println("Received radius from client: " + radius);

            // Compute area of circle
            double area = Math.PI * radius * radius;

            // Send result back to client
            dos.writeDouble(area);
            dos.flush();
            System.out.println("Area sent to client: " + area);

            // Close connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
