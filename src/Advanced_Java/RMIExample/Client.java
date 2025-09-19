import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Get reference to RMI registry on localhost
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup for remote object
            Calculator calc = (Calculator) registry.lookup("CalculatorService");

            int a = 10, b = 5;
            System.out.println("Numbers: " + a + " , " + b);

            System.out.println("Sum = " + calc.sum(a, b));
            System.out.println("Difference = " + calc.difference(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
