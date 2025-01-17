package dcoms;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class Client {
    public static void main(String[] args) throws RemoteException, 
                        NotBoundException, MalformedURLException
    {
        Interface server = (Interface)Naming.lookup("rmi://localhost:1444"
                                                                + "/HRserver");
        
        List<String[]> employees = server.getAllEmployees();
        System.out.println("Employee Data:");
        // Iterate and print each employee's details
        for (String[] employee : employees) {
            System.out.println("ID: " + employee[0] +
                               " - First Name: " + employee[1] +
                               " - Last Name: " + employee[2] +
                               " - IC: " + employee[3] +
                               " - Leave Balance: " + employee[4] + "\n\n");
        }
    }
}
