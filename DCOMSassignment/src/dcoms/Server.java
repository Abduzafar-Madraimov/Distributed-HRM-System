package dcoms;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Server extends UnicastRemoteObject implements Interface{
    public Server() throws RemoteException{
        super();
    }
    
    //Methods
    @Override
    
    
    // GET ALL EMPLOYEE INFORMATION
    public List<String[]> getAllEmployees() throws RemoteException {
        List<String[]> employees = new ArrayList<>();
        String query = "SELECT * FROM tbl_Employees";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String[] employee = new String[5];
                employee[0] = String.valueOf(rs.getInt("Emp_ID"));
                employee[1] = rs.getString("Emp_FirstName");
                employee[2] = rs.getString("Emp_LastName");
                employee[3] = rs.getString("Emp_IC");
                employee[4] = String.valueOf(rs.getInt("Emp_LeaveBalance"));
                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }
}
