/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.File;
import java.io.FileOutputStream;
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
public class ReceiveFile {//on going development and testing

    private static final int port = 21;
    private static final int timeOut = 50000;

    public static void main(String[] args) throws IOException {
        File file = new File("Received Files");
        file.mkdir();
        
        System.out.println("Received files dir: " + file.getAbsolutePath());
        ServerSocket server = null;
        String fileName = "";
        try {
            server = new ServerSocket(port);
            server.setSoTimeout(timeOut);
            InetAddress myAddress = InetAddress.getLocalHost();//get the address
            System.out.println("Host name: " + myAddress);
            while (true) {
                System.out.println("Waiting...");
                Socket myClient = server.accept();
                System.out.println(myClient.getInetAddress().getHostName()
                        + "/" + myClient.getInetAddress().getHostAddress()
                        + " is sending a file...");
                InputStream is = myClient.getInputStream();
                
                StringBuilder sb = new StringBuilder();
                int c;
                
                while ((c = is.read()) != -1) {
                    sb.append((char)c);
                    if((char)c == '$')   
                        break;
                }
                fileName = sb.toString();
                System.out.println(fileName);
                OutputStream os = myClient.getOutputStream();
                os.write(1);
                FileOutputStream out = new FileOutputStream(
                        file.getAbsoluteFile() + "\\" + fileName.substring(0, fileName.length()-1));
                int d;
                while ((d = is.read()) != -1) {
                    out.write(d);
                }
                is.close();
                out.close();
                myClient.close();
                System.out.println("File was received!");
            }
        } catch (IOException ex) {
            System.err.println(ex);
            System.err.printf("Server has been idle for %dms", server.getSoTimeout());
        } finally {
            if (server != null) {
                server.close();
                System.out.println("Server connection was close.");
            }
        }
    }
}
