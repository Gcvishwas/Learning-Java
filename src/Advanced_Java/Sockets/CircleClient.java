package Advanced_Java.Sockets;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CircleClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // or IP address of server
        int port = 5000;

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to server.");

            // Input & Output streams
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Take radius input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter radius of circle: ");
            double radius = scanner.nextDouble();

            // Send radius to server
            dos.writeDouble(radius);
            dos.flush();

            // Receive area from server
            double area = dis.readDouble();
            System.out.println("Area of circle: " + area);

            // Close connection
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
