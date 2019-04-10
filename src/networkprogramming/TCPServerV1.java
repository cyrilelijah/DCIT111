/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author cyrilelijahaurino
 */
public class TCPServerV1 {
    static final int port = 1024;
    static final int timeOut = 10000;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(port);
//            server.setSoTimeout(timeOut);
            InetAddress address = InetAddress.getLocalHost();//get the address 
            System.out.println("Server is running on " + address);
            
            Socket client = server.accept();//invoke accept / listen
            System.out.println("Client @" + client.getLocalAddress() + " is connected.");
            
            InputStream in = client.getInputStream();//inputstream to read the bytes from the client
            BufferedInputStream bw = new BufferedInputStream(in);//buffer the input
            while (bw.available() > 0) {      
                System.out.print((char) bw.read());
            }
            System.out.println("");
            
            OutputStream out = client.getOutputStream();// send data to the client
            String msg = "I received your message.";
            out.write(msg.getBytes());//will send to the client
            
            in.close();//close streams
            out.close();//
            client.close();//
            server.close();//
        } catch (IOException ex) {
            System.out.println(ex);
        }    
    }
}
