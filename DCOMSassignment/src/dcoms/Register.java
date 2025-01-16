package dcoms;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Register {
    public static void main(String args[]) throws RemoteException{
        Registry reg = LocateRegistry.createRegistry(1444);
        reg.rebind("HRserver", new Server());
        System.out.println("Server is Running!");
    }
}
