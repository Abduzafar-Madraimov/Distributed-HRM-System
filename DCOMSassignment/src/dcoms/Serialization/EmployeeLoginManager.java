package dcoms.Serialization;

import java.util.List;

public class EmployeeLoginManager {
    private static final String filePath = "C:/Users/amazi/Desktop/Year 3/Distibuted Systems/Assignment/employees_data.ser";
    public static boolean updatePassword(String employeeIC, String newPassword) {
        // Load all logins from the file
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);

        // Find the matching login and update the password
        boolean updated = false;
        for (EmployeeLogin login : logins) {
            if (login.getEmployeeIC().equals(employeeIC)) {
                // Update password
                login.setPassword(newPassword);
                updated = true;
                break;
            }
        }

        // Save the updated list back to the file
        if (updated) {
            try {
                // Clear the file and save all updated objects
                new java.io.File(filePath).delete(); // Delete existing file
                for (EmployeeLogin login : logins) {
                    EmployeeLoginSerializer.saveLogin(login);
                }
                return true; // Return true if update was successful
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false; // Return false if no matching employee was found or an error occurred
    }
    
    public static boolean deleteEmployee(String employeeIC) {
        // Load all employees
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);

        // Remove the employee with the matching IC
        boolean removed = logins.removeIf(login -> login.getEmployeeIC().equals(employeeIC));

        // Overwrite the file if an employee was removed
        if (removed) {
            return overwriteFile(logins);
        }
        return false;
    }

    private static boolean overwriteFile(List<EmployeeLogin> logins) {
        try {
            // Clear the file and reserialize all logins
            new java.io.File(filePath).delete(); // Delete existing file
            for (EmployeeLogin login : logins) {
                EmployeeLoginSerializer.saveLogin(login);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}