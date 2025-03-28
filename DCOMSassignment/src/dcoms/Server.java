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
        String query = "SELECT * FROM TBL_EMPLOYEES";

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
    
    // CHECK IF IC EXISTS FOR VALIDATION
    @Override
    public boolean checkIfICExists(String IC) throws RemoteException {
        String query = "SELECT COUNT(*) FROM tbl_Employees WHERE Emp_IC = ?";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {

            // Set the IC parameter
            stmt.setString(1, IC);

            // Execute the query
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Return true if count > 0, meaning IC exists
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Return false if an exception occurs or IC doesn't exist
    }
    
    @Override
    // ADD NEW EMPLOYEE
    public Boolean addNewEmployee(String firstName, String lastName, String IC) throws RemoteException{
        String query = "INSERT INTO TBL_EMPLOYEES(Emp_FirstName, Emp_LastName, Emp_IC, Emp_LeaveBalance) VALUES (?, ?, ?, ?)";
        try(Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);){
            if(!checkIfICExists(IC)){
                stmt.setString(1, firstName); //add first name to value
                stmt.setString(2, lastName); //add last name to value
                stmt.setString(3, IC); // add IC to value 
                stmt.setInt(4, 30); // hard coded 30 days of leave balance at every new employee creation

                int insertedRows = stmt.executeUpdate();
                return insertedRows > 0; // If 1 row is inserted, return true
            }
            System.out.println("IC Already Exists");
            return null; // return null to differentiate between IC error or Server/DB Error
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    // EDIT EMPLOYEE DATA
    @Override
    public Boolean editEmployee(String id, String firstName, String lastName, String originalIC, String newIC, int leaveBalance) throws RemoteException {
        // Only check if IC exists if the user is trying to change it
        if (!originalIC.equals(newIC) && checkIfICExists(newIC)) {
            System.out.println("IC already exists in the database for another employee.");
            return null; // IC conflict
        }

        String query = "UPDATE TBL_EMPLOYEES SET Emp_FirstName = ?, Emp_LastName = ?, Emp_IC = ?, Emp_LeaveBalance = ? WHERE Emp_ID = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {   

            // Set the parameters for the UPDATE query
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, newIC);
            stmt.setInt(4, leaveBalance);
            stmt.setString(5, id);

            // Execute the query
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0; // Return true if at least one row was updated
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }

    
    // DELETE AN EMPLOYEE
    @Override
    public boolean deleteEmployee(String id) throws RemoteException {
        String query = "DELETE FROM tbl_Employees WHERE Emp_ID = ?";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the ID parameter for the DELETE query
            stmt.setString(1, id);

            // Execute the query
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0; // Return true if at least one row was deleted
        } 
        catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
    
    // GET ALL LEAVE REQUESTS
    @Override
    public List<String[]> getAllLeaveRequests() throws RemoteException {
        List<String[]> leaveRequests = new ArrayList<>();
        String query = "SELECT r.LeaveRequest_ID, e.Emp_FirstName, e.Emp_LastName, " +
                       "r.LeaveRequest_CommencementDate, r.LeaveRequestAmount, " +
                       "r.LeaveRequest_Status, r.LeaveRequest_CreationDate, e.Emp_ID " +
                       "FROM tbl_LeaveRequests r " +
                       "JOIN tbl_Employees e ON r.Emp_ID = e.Emp_ID";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {

               // Iterate through the result set and populate the list
               while (rs.next()) {
                   String[] request = new String[8];
                   request[0] = String.valueOf(rs.getInt("LeaveRequest_ID")); // Leave Request ID
                   request[1] = rs.getString("Emp_FirstName");       // First Name
                   request[2] = rs.getString("Emp_LastName");        // Last Name
                   request[3] = rs.getString("LeaveRequest_CommencementDate"); // Leave Commencement Date
                   request[4] = String.valueOf(rs.getInt("LeaveRequestAmount")); // Leave Amount
                   request[5] = rs.getString("LeaveRequest_Status"); // Leave Status
                   request[6] = rs.getString("LeaveRequest_CreationDate"); // Leave Creation Date
                   request[7] = rs.getString("Emp_ID");    // EmpID

                   leaveRequests.add(request);
               }
           } 
           catch (Exception e) {
               e.printStackTrace();
               System.out.println("Error in getting all leave requests");
           }

       return leaveRequests;
   }
    
    @Override
    public List<String[]> getLeaveRequestsByIC(String IC) throws RemoteException {
        String query = "SELECT r.LeaveRequest_ID, e.Emp_FirstName, e.Emp_LastName, " +
                       "r.LeaveRequest_CommencementDate, r.LeaveRequestAmount, " +
                       "r.LeaveRequest_Status, r.LeaveRequest_CreationDate, e.Emp_ID " +
                       "FROM tbl_LeaveRequests r " +
                       "JOIN tbl_Employees e ON r.Emp_ID = e.Emp_ID " +
                       "WHERE e.Emp_IC = ?";

        List<String[]> requests = new ArrayList<>(); // Initialize the list to store multiple results

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the IC parameter for the query
            stmt.setString(1, IC);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Process the result set
            while (rs.next()) {
                String[] request = new String[8];
                request[0] = String.valueOf(rs.getInt("LeaveRequest_ID")); // Leave Request ID as String
                request[1] = rs.getString("Emp_FirstName");                // First Name
                request[2] = rs.getString("Emp_LastName");                 // Last Name
                request[3] = rs.getString("LeaveRequest_CommencementDate"); // Leave Commencement Date
                request[4] = String.valueOf(rs.getInt("LeaveRequestAmount")); // Leave Amount as String
                request[5] = rs.getString("LeaveRequest_Status");          // Leave Status
                request[6] = rs.getString("LeaveRequest_CreationDate");    // Leave Creation Date
                request[7] = rs.getString("Emp_ID");    // EmpID

                requests.add(request); // Add the current row to the list
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return requests; // Return the list (empty if no results)
    }

    // GET EMPLOYEE STATUS HISTORY
    public List<String[]> getApprovedOrDeniedLeaveRequests(String ID) {
        String query = "SELECT LeaveRequest_ID, LeaveRequest_CommencementDate, " +
                       "LeaveRequest_Status, LeaveRequest_CreationDate, LeaveRequestAmount " +
                       "FROM tbl_LeaveRequests WHERE LeaveRequest_Status IN ('Approved', 'Denied') AND Emp_ID = ?";

        List<String[]> leaveRequests = new ArrayList<>();

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            stmt.setString(1, ID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String[] request = new String[6];
                request[0] = String.valueOf(rs.getInt("LeaveRequest_ID")); // Request ID
                request[1] = rs.getString("LeaveRequest_CommencementDate"); // Commencement Date
                request[2] = rs.getString("LeaveRequest_Status"); // Status
                request[3] = rs.getString("LeaveRequest_CreationDate"); // Creation Date
                request[4] = rs.getString("LeaveRequestAmount"); // Creation Date

                leaveRequests.add(request);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leaveRequests;
    }

    // UPDATE LEAVE STATUS OF EMPLOYEE
    @Override
    public boolean updateLeaveStatus(String leaveRequestId, String newStatus, String empID, String AMT) throws RemoteException {
        String query = "UPDATE tbl_LeaveRequests SET LeaveRequest_Status = ? WHERE LeaveRequest_ID = ?";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the parameters for the query
            stmt.setString(1, newStatus);                  // New leave status
            stmt.setString(2, leaveRequestId); // Convert leaveRequestId to int
             if(newStatus.equals("Approved")){
                if(updateLeaveBalance(empID, AMT)){
                    // Execute the update
                    int rowsUpdated = stmt.executeUpdate();
                    return rowsUpdated > 0; // Return true if at least one row was updated
                }
                return false;
             }
            // Execute the update
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0; // Return true if at least one row was updated
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
    
    @Override
    public boolean updateLeaveBalance(String empID, String AMT) throws RemoteException {
        String query = "UPDATE tbl_Employees " +
                       "SET Emp_LeaveBalance = Emp_LeaveBalance - ? " +
                       "WHERE Emp_ID = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            stmt.setInt(1, Integer.parseInt(AMT)); // Set the amount to subtract
            stmt.setString(2, empID); // Set the employee ID

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // Return true if at least one row is updated
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an exception occurs
        }
    }
    
    // GET EMPLOYEE DETAILS
    @Override
    public String[] getEmployeeDetailsByIC(String ic) throws RemoteException{
        String query = "SELECT Emp_ID, Emp_FirstName, Emp_LastName, Emp_LeaveBalance FROM tbl_Employees WHERE Emp_IC = ?";
        String[] employeeDetails = null;

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the IC parameter
            stmt.setString(1, ic);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // If a matching employee is found, populate the array
            if (rs.next()) {
                employeeDetails = new String[4];
                employeeDetails[0] = String.valueOf(rs.getInt("Emp_ID")); // Employee ID (as String)
                employeeDetails[1] = rs.getString("Emp_FirstName"); // First Name
                employeeDetails[2] = rs.getString("Emp_LastName");  // Last Name
                employeeDetails[3] = String.valueOf(rs.getInt("Emp_LeaveBalance")); // Leave Balance (as String)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return employeeDetails; // Return null if no employee is found
    }
    
    // APPLY FOR LEAVE REQUEST
    @Override
    public boolean applyLeaveRequest(String empId, String commencementDate, String amountOfDays) throws RemoteException {
        String query = "INSERT INTO tbl_LeaveRequests (Emp_ID, LeaveRequest_CommencementDate, LeaveRequestAmount, LeaveRequest_Status, LeaveRequest_CreationDate) " +
                       "VALUES (?, ?, ?, 'Pending', CURRENT_DATE)";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the parameters for the query
            stmt.setInt(1, Integer.parseInt(empId)); // Employee ID as integer
            stmt.setString(2, commencementDate);    // Commencement Date as string
            stmt.setInt(3, Integer.parseInt(amountOfDays)); // Amount of Days as integer

            // Execute the query
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0; // Return true if the insertion is successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
    
    // VIEW EMPLOYEE REQUEST STATUS (AND HISTORY)
    @Override
    public List<String[]> viewRequestStatusByEmpId(String empId) throws RemoteException {
        String query = "SELECT LeaveRequest_CreationDate, LeaveRequestAmount, LeaveRequest_CommencementDate, LeaveRequest_Status " +
                       "FROM tbl_LeaveRequests WHERE Emp_ID = ?";
        List<String[]> leaveRequests = new ArrayList<>();

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);) {
            // Set the Employee ID parameter
            stmt.setInt(1, Integer.parseInt(empId));

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Process the result set
            while (rs.next()) {
                String[] request = new String[4];
                request[0] = rs.getString("LeaveRequest_CreationDate");       // Creation Date
                request[1] = String.valueOf(rs.getInt("LeaveRequestAmount")); // Amount of Days
                request[2] = rs.getString("LeaveRequest_CommencementDate");  // Commencement Date
                request[3] = rs.getString("LeaveRequest_Status");            // Status

                leaveRequests.add(request);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return leaveRequests; // Return the list of leave requests
    }
}
