package com.shopsphere.rmi.server;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements InventoryService {
    public RMIServer() throws RemoteException { super(); }
    
    public int getStock(int productId) throws RemoteException {
        return 50; 
    }
    
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/InventoryService", new RMIServer());
            System.out.println("RMI Inventory Server Started.");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
