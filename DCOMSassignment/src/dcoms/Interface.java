package dcoms;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Interface extends Remote{ // we extend remote to use this method on another machines
    public List<String[]> getAllEmployees() throws RemoteException; // RETURN LIST OF EMPLOYEES
    public boolean checkIfICExists(String IC)throws RemoteException; // CHECK IF THE IC EXISTS
    public Boolean addNewEmployee(String firstName, String lastName, String IC) throws RemoteException; // ADD NEW EMPLOYEE
    public Boolean editEmployee(String id, String firstName, String lastName, String originalIC, String newIC, int leaveBalance) throws RemoteException;
    public boolean deleteEmployee(String id) throws RemoteException; // EDIT AN EMPLOYEE
    public List<String[]> getAllLeaveRequests() throws RemoteException; // GET LEAVE REQUESTS OF EMPLOYEES
    public List<String[]> getLeaveRequestsByIC(String IC) throws RemoteException; // GET LEAVE REQUESTS OF SPECIFIC EMPLOYEE
    public List<String[]> getApprovedOrDeniedLeaveRequests(String ID) throws RemoteException; // GET LEAVE REQUESTS OF SPECIFIC EMPLOYEE ID
    public boolean updateLeaveStatus(String leaveRequestId, String newStatus, String empID, String AMT) throws RemoteException; // UPDATE LEAVE STATUS
    public boolean updateLeaveBalance(String empID, String AMT) throws RemoteException; // UPDATE LEAVE BALANCE AFTER APPROVAL
    public String[] getEmployeeDetailsByIC(String ic) throws RemoteException; // GET EMPLOYEE DETAILS
    public boolean applyLeaveRequest(String empId, String commencementDate, String amountOfDays) throws RemoteException; // APPLY FOR LEAVE
    public List<String[]> viewRequestStatusByEmpId(String ID) throws RemoteException; // APPLY FOR LEAVE



}
