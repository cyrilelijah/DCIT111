/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author cyrilelijahaurino
 */
public class TCPClientV1 {
    private static final int port = 1024;
    private static final String host = "127.0.0.1";
    
    public static void main(String[] args) {
        
        try {
            Socket socket = new Socket(host, port);
            OutputStream out = socket.getOutputStream();
            String msg = "Hello";
            out.write(msg.getBytes());//convert to bytes
            
            
            InputStream in = socket.getInputStream();
            int c;
            while ((c = in.read()) > -1) {                
                System.out.print((char) c);
            }
            System.out.println("");
            
            in.close();//close streams
            out.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
