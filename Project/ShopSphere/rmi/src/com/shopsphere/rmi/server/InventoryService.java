package com.shopsphere.rmi.server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InventoryService extends Remote {
    int getStock(int productId) throws RemoteException;
}
