/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author cyrilelijahaurino
 */
public class SendFile {//on going development and testing

    private static final int port = 1024;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path of the file: ");
        String path = sc.nextLine();
        System.out.print("Enter receiver (host name): ");
        String host = sc.nextLine();
        File fileToSend = new File(path);
        try {
            send(fileToSend, host);
        } catch (IOException ex) {
            System.out.println("Failed to send");
        }
    }

    private static void send(File file, String host) throws IOException {

        String fiLe = file.getAbsolutePath();
        String fileName = fiLe.substring(fiLe.lastIndexOf("\\")+1, fiLe.length())+"$";
        System.out.println(fileName);
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(host, port));
        FileInputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(file.getAbsolutePath());
            out = socket.getOutputStream();
            out.write(fileName.getBytes());
//            out.flush();
            in.read();
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File was sent successfully.");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } finally {
            if (in != null) {
                in.close();// Always close stream
            }
            if (out != null) {
                out.close();// Always close stream
            }
            socket.close();
        }
    }
}
