// Implementation of the remote interface
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloWorld {

    // Constructor
    public HelloImpl() throws RemoteException {
        super();
    }

    // Implementation of the remote method
    public String display() throws RemoteException {
        return "Hello, World!";
    }
    
}


