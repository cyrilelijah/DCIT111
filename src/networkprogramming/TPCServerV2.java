/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author cyrilelijahaurino
 */
public class TPCServerV2 {

    private static final int port = 1024;
    private static final int timeOut = 50000;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        BufferedReader bw = null;
        try {
            server = new ServerSocket(port);
            server.setSoTimeout(timeOut);
//            server.bind(new InetSocketAddress(port));
            InetAddress myAddress = InetAddress.getLocalHost();//get the address
            System.out.println("Host name: " + myAddress);
//            InetAddress[] addresses = InetAddress.getAllByName(myAddress.getHostName());
//            for (InetAddress add : addresses) {
//                System.out.println(add.getHostAddress());
//            }
            while (true) {
                System.out.println("Waiting for client...");
                Socket myClient = server.accept();
                System.out.println("Client @ "
                        + myClient.getInetAddress().getHostName()
                        + "/" + myClient.getInetAddress().getHostAddress()
                        + " is connected!");

                bw = new BufferedReader(
                        new InputStreamReader(
                                myClient.getInputStream()));
                System.out.println("Client: " + bw.readLine());
                PrintWriter pw = new PrintWriter(myClient.getOutputStream(), true);
//                Scanner sc = new Scanner(System.in);
                pw.println("I receive your message!");
                pw.close();
                bw.close();
                myClient.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
            System.err.printf("Server has been idle for %dms", server.getSoTimeout());
        } finally {
            if (server != null) {
                server.close();
                System.out.println("Server connection was close.");
            }
            if (bw != null) {
                bw.close();
            }
        }
    }
}