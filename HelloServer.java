// Server program
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * RMI server that registers a {@link HelloWorld} implementation.
 */
public class HelloServer {

    public static final int DEFAULT_PORT = 1099;
    public static final String BIND_NAME = "HelloWorld";

    public static void main(String[] args) {
        int port = DEFAULT_PORT;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid port: " + args[0]);
                System.exit(1);
            }
        }

        try {
            Registry registry;
            try {
                registry = LocateRegistry.createRegistry(port);
            } catch (RemoteException e) {
                // A registry may already be running on this port.
                registry = LocateRegistry.getRegistry(port);
            }

            HelloImpl obj = new HelloImpl();
            registry.rebind(BIND_NAME, obj);

            System.out.println("Server is running on port " + port + "...");

            // Keep the JVM alive to serve remote calls.
            while (true) {
                Thread.sleep(60_000L);
            }
        } catch (Exception e) {
            System.err.println("Server error: " + e);
            e.printStackTrace();
            System.exit(1);
        }
    }
}
