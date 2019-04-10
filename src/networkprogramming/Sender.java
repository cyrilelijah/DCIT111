/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyrilelijahaurino
 */
public class Sender {

    private static final int BUFF_SIZE = 1024;
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private static DatagramSocket socket;

    public static void main(String[] args) throws IOException {
        try {
            socket = new DatagramSocket();
            InetAddress myaddAddress = InetAddress.getLocalHost();
            System.out.println(myaddAddress + ":" + socket.getLocalPort());
        } catch (SocketException ex) {
            System.out.println(ex);
        }
        System.out.print("Enter address: ");
        String address = reader.readLine();
        System.out.print("Enter port: ");
        int port = Integer.parseInt(reader.readLine());
        System.out.println("Enter message: ");
        String msg = reader.readLine();
        sendPacket(address, port, msg);
    }

    private static void sendPacket(String host, int port, String msg) {
        byte[] buff = new byte[BUFF_SIZE];
        ByteArrayInputStream bArrMsg = new ByteArrayInputStream(msg.getBytes());
        try {
            InetAddress toHost = InetAddress.getByName(host);
            int len;
            while ((len = bArrMsg.read(buff)) != -1) {
                System.out.println("Len:" + len);
                DatagramPacket outPacket = new DatagramPacket(buff, len, toHost, port);
                socket.send(outPacket);
            }
            socket.close();
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
