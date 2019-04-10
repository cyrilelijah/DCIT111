/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author cyrilelijahaurino
 */
public class ReceiveCode {
    private static final int port = 1024;
    private static final int timeOut = 100000;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        String fileName = "";
        try {
            server = new ServerSocket(port);
//            server.setSoTimeout(timeOut);
            InetAddress myAddress = InetAddress.getLocalHost();//get the address
            System.out.println("Host name: " + myAddress);
            while (true) {
                System.out.println("Waiting...");
                Socket myClient = server.accept();
                System.out.println(myClient.getInetAddress().getHostName()
                        + "/" + myClient.getInetAddress().getHostAddress()
                        + " is sending a code...");
                InputStream is = myClient.getInputStream();
                BufferedReader bw = new BufferedReader(new InputStreamReader(is));
                String toRead = null;
                while ((toRead = bw.readLine()) != null) {
                    System.out.println(toRead);
                }
                System.out.println("Here");
                System.out.println(fileName);
                
                is.close();
                myClient.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } 
        finally {
            if (server != null) {
                server.close();
                System.out.println("Server connection was close.");
            }
        }
    }
}
