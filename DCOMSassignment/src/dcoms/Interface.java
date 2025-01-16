package dcoms;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Interface extends Remote{ // we extend remote to use this method on another machines
    public List<String[]> getAllEmployees() throws RemoteException;
}
