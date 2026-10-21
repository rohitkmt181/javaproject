import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// Program 3: Server
public class Server {
    public static void main(String args[]) {
        try {
            // Create remote object
            Adder stub = new AdderImpl();
            
            // Start RMI Registry on port 1099
            LocateRegistry.createRegistry(1099);
            
            // Bind the remote object using rebind() as mentioned in index 22
            Naming.rebind("rmi://localhost:1099/AdderService", stub);
            
            System.out.println("RMI Server is running and AdderService is ready...");
        } catch(Exception e) {
            System.out.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
