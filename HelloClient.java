// Client program
import java.rmi.*;
public class HelloClient {
 public static void main(String args[]) {
 try {
 // Look up the remote object registered by the server.
 HelloWorld remoteObj =
 (HelloWorld) Naming.lookup(
 "rmi://localhost:1099/HelloWorld"
 );
 // Invoke the remote method and display its response.
 System.out.println(remoteObj.display());
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}