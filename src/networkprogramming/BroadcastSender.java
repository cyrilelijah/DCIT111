/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author cyrilelijahaurino
 */
public class BroadcastSender {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket socket = new DatagramSocket();
//        socket.setSoTimeout(10000);
//        socket.setBroadcast(true);
        System.out.println("Broadcaster's Information");
        System.out.println(InetAddress.getLocalHost() + ":" + socket.getLocalPort());
        System.out.print("Enter message: ");

        byte[] bMsg = reader.readLine().getBytes();
        socket.send(new DatagramPacket(bMsg, bMsg.length, InetAddress.getByName("255.255.255.255"), 1025));
        DatagramPacket datagram = new DatagramPacket(new byte[1024], 1024);
        socket.receive(datagram);
        System.out.println(datagram.getAddress() + ":" + datagram.getPort());
        System.out.println("Message: " + new String(datagram.getData()).trim());

    }
}
