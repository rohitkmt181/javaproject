import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

// Program 2: Remote Implementation
public class AdderImpl extends UnicastRemoteObject implements Adder {
    
    // Constructor must throw RemoteException
    public AdderImpl() throws RemoteException {
        super();
    }
    
    // Implementing the remote method
    public int add(int n1, int n2) throws RemoteException {
        return n1 + n2;
    }
}
