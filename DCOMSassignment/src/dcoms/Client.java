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
        Interface server = (Interface)Naming.lookup("rmi://localhost:1444/HRserver");
        
         // Show the main page
        mainPage MainPage = new mainPage(server); // Pass the server instance
        MainPage.setVisible(true);
    }
}
