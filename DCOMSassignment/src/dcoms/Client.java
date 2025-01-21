package dcoms;

import dcoms.Serialization.EmployeeLogin;
import dcoms.Serialization.EmployeeLoginDeserializer;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class Client {
    public static void main(String[] args) throws RemoteException, 
                        NotBoundException, MalformedURLException
    {
        Interface server = (Interface)Naming.lookup("rmi://localhost:1444/HRserver");
        
        
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins("C:/Users/amazi/Desktop/Year 3/Distibuted Systems/Assignment/employees_data.ser");
        for (EmployeeLogin login : logins) {
            System.out.println("Employee IC: " + login.getEmployeeIC());
            System.out.println("Password: " + login.getPassword());
        }
        
         // Show the main page
        mainPage MainPage = new mainPage(server); // Pass the server instance
        MainPage.setVisible(true);
    }
}
