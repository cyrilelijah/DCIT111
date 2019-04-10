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
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author cyrilelijahaurino
 */
public class Receiver {

    private static final int BUFF_SIZE = 1024;
    private static DatagramSocket socket;

    public static void main(String[] args) {
        try {
            socket = new DatagramSocket(1024);
            InetAddress myaddAddress = InetAddress.getLocalHost();
            System.out.println(myaddAddress + ":" + socket.getLocalPort());
            receive();
        } catch (SocketException ex) {
            System.out.println(ex);
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
    }

    public static void receive() {
        while (true) {
            byte[] msg = new byte[BUFF_SIZE];
            DatagramPacket packet = new DatagramPacket(msg, BUFF_SIZE);
            try {
                socket.receive(packet);
                String sender = packet.getAddress().getHostName() + "("
                        + packet.getPort() + ")";
                System.out.println(sender + ": " + new String(packet.getData()));
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
