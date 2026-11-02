import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote interface for the Hello World RMI service.
 */
public interface HelloWorld extends Remote {

    /**
     * Returns a greeting message from the server.
     *
     * @return the greeting string
     * @throws RemoteException if a remote communication error occurs
     */
    String display() throws RemoteException;
}
