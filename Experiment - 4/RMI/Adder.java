import java.rmi.Remote;
import java.rmi.RemoteException;

// Program 1: Remote Interface
public interface Adder extends Remote {
    // Declaring the remote method as mentioned in "23. What Happens When Client Calls add()?"
    public int add(int n1, int n2) throws RemoteException;
}
