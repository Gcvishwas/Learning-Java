import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create implementation object
            CalculatorImpl calc = new CalculatorImpl();

            // Create registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object
            registry.rebind("CalculatorService", calc);

            System.out.println("Server is running. CalculatorService bound in registry...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
