// Client program
import java.rmi.Naming;

/**
 * RMI client that looks up and invokes the remote {@link HelloWorld} service.
 */
public class HelloClient {

    public static final int DEFAULT_PORT = 1099;

    public static void main(String[] args) {
        String host = "localhost";
        int port = DEFAULT_PORT;

        if (args.length > 0) {
            host = args[0];
        }
        if (args.length > 1) {
            try {
                port = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid port: " + args[1]);
                System.exit(1);
            }
        }

        try {
            HelloWorld remoteObj = (HelloWorld) Naming.lookup(
                    "rmi://" + host + ":" + port + "/HelloWorld");
            System.out.println(remoteObj.display());
        } catch (Exception e) {
            System.err.println("Client error: " + e);
            e.printStackTrace();
            System.exit(1);
        }
    }
}
