package Advanced_Java.TCP_UDP;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 6000;

        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Hello Server, this is UDP Client!";
            byte[] buffer = message.getBytes();

            InetAddress serverAddress = InetAddress.getByName(host);
            DatagramPacket request = new DatagramPacket(buffer, buffer.length, serverAddress, port);
            socket.send(request);

            byte[] responseBuffer = new byte[1024];
            DatagramPacket response = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(response);

            String reply = new String(response.getData(), 0, response.getLength());
            System.out.println("Server says: " + reply);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
