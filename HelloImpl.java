// Implementation of the remote interface
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Server-side implementation of {@link HelloWorld}.
 */
public class HelloImpl extends UnicastRemoteObject implements HelloWorld {

    private static final long serialVersionUID = 1L;

    // Constructor
    public HelloImpl() throws RemoteException {
        super();
    }

    // Implementation of the remote method
    @Override
    public String display() throws RemoteException {
        return "Hello, World!";
    }
}
