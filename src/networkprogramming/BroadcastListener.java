/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author cyrilelijahaurino
 */
public class BroadcastListener {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1025);
//        socket.setSoTimeout(10000);
        socket.setBroadcast(true);
        System.out.println("-Listener's Information-");
        System.out.println("  Address:" + InetAddress.getLocalHost());
        System.out.println("  Port:" + socket.getLocalPort());
        while (true) {            
            DatagramPacket datagram = new DatagramPacket(new byte[1024], 1024);
            socket.receive(datagram);
            byte[] msg = "I received your message!".getBytes();
            System.out.println("-Broadcaster's Information-");
            //Print sender's address from the received datagram
            System.out.println("  Host: " + datagram.getAddress());
            //Print sender's port from the received datagram
            System.out.println("  Port: " + datagram.getPort());
            //Print sender's message
            System.out.println("  Message: " + new String(datagram.getData()).trim());
            //Send a reply to the sender directly (not broadcast)
            socket.send(new DatagramPacket(msg, msg.length, datagram.getAddress(), datagram.getPort()));
        }

    }
}
