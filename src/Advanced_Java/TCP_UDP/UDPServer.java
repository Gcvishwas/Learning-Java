package Advanced_Java.TCP_UDP;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        int port = 6000; // server port
        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("UDP Server started. Waiting for client...");

            byte[] buffer = new byte[1024];
            DatagramPacket request = new DatagramPacket(buffer, buffer.length);

            socket.receive(request); // receive from client
            String message = new String(request.getData(), 0, request.getLength());
            System.out.println("Received from client: " + message);

            String response = "Hello from UDP Server! You said: " + message;
            byte[] responseBytes = response.getBytes();

            InetAddress clientAddress = request.getAddress();
            int clientPort = request.getPort();

            DatagramPacket reply = new DatagramPacket(responseBytes, responseBytes.length, clientAddress, clientPort);
            socket.send(reply);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
