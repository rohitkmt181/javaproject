import java.rmi.Naming;

// Program 4: Client
public class Client {
    public static void main(String args[]) {
        try {
            // Lookup the remote object from the RMI Registry
            Adder stub = (Adder) Naming.lookup("rmi://localhost:1099/AdderService");
            
            // Call the remote method
            int a = 15;
            int b = 25;
            System.out.println("Calling add(" + a + ", " + b + ") on the server...");
            int result = stub.add(a, b);
            
            System.out.println("Result received from server: " + result);
        } catch(Exception e) {
            System.out.println("Client Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
