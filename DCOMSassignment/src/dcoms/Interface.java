package dcoms;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Interface extends Remote{ // we extend remote to use this method on another machines
    public List<String[]> getAllEmployees() throws RemoteException; // RETURN LIST OF EMPLOYEES
    public boolean checkIfICExists(String IC)throws RemoteException; // CHECK IF THE IC EXISTS
    public Boolean addNewEmployee(String firstName, String lastName, String IC) throws RemoteException; // ADD NEW EMPLOYEE
    public boolean editEmployee(String id, String firstName, String lastName, String ic, int leaveBalance) throws RemoteException; // EDIT AN EMPLOYEE
    public boolean deleteEmployee(String id) throws RemoteException; // EDIT AN EMPLOYEE
    public List<String[]> getAllLeaveRequests() throws RemoteException; // GET LEAVE REQUESTS OF EMPLOYEES
    public String[] getLeaveRequestsByIC(String IC) throws RemoteException; // GET LEAVE REQUESTS OF SPECIFIC EMPLOYEE
    public boolean updateLeaveStatus(String leaveRequestId, String newStatus) throws RemoteException; // UPDATE LEAVE STATUS
    public String[] getEmployeeDetailsByIC(String ic) throws RemoteException; // GET EMPLOYEE DETAILS
    public boolean applyLeaveRequest(String empId, String commencementDate, String amountOfDays) throws RemoteException; // APPLY FOR LEAVE
    public List<String[]> viewRequestStatusByEmpId(String ID) throws RemoteException; // APPLY FOR LEAVE



}
