import java.rmi.*;

public interface HelloWorld extends Remote {

    // Method that can be called remotely by the client.
    public String display() throws RemoteException;
    
}
