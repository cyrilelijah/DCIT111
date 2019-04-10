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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author cyrilelijahaurino
 */
public class TCPClientV2 {

    private static final int port = 1024;
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String host = "";
        System.out.print("Enter host address/name: ");
        host = sc.nextLine();
        
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port));
            System.out.println("Connected to " + socket.getInetAddress());
            
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            System.out.print("Enter message: ");
            pw.println(sc.nextLine());
            
            BufferedReader bw = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            System.out.println("Server: " + bw.readLine());
            
            bw.close();
            pw.close();
            socket.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } 
    }
}
