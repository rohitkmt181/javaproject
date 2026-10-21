package com.shopsphere.network.server;
import java.io.*;
import java.net.*;

public class InventorySocketServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Inventory Socket Server running on port 6000...");
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                
                String command = in.readLine();
                if(command != null && command.startsWith("GET_STOCK")) {
                    out.println("STOCK: 50");
                } else {
                    out.println("INVALID_COMMAND");
                }
                socket.close();
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}
