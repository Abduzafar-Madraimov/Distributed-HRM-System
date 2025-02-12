package dcoms.Serialization;

import java.util.List;

public class EmployeeLoginManager {
    private static final String filePath = "C:/Users/amazi/Desktop/Year 3/Distibuted Systems/Assignment/employees_data.ser";

    // Update Employee Password
    public static boolean updatePassword(String employeeIC, String newPassword) {
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);
        boolean updated = false;

        for (EmployeeLogin login : logins) {
            if (login.getEmployeeIC().equals(employeeIC)) {
                login.setPassword(newPassword); // Update password
                updated = true;
                break;
            }
        }

        return updated && overwriteFile(logins);
    }

    // Update Employee IC
    public static boolean updateIC(String oldIC, String newIC) {
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);
        boolean updated = false;

        for (EmployeeLogin login : logins) {
            if (login.getEmployeeIC().equals(oldIC)) {
                login.setIC(newIC); // Update IC
                updated = true;
                break;
            }
        }

        return updated && overwriteFile(logins);
    }

    // Update both Employee IC & Password
    public static boolean updateICAndPassword(String oldIC, String newIC, String newPassword) {
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);
        boolean updated = false;

        for (EmployeeLogin login : logins) {
            if (login.getEmployeeIC().equals(oldIC)) {
                login.setIC(newIC); // Update IC
                login.setPassword(newPassword); // Update password
                updated = true;
                break;
            }
        }

        return updated && overwriteFile(logins);
    }

    // Delete Employee from Serialized File
    public static boolean deleteEmployee(String employeeIC) {
        List<EmployeeLogin> logins = EmployeeLoginDeserializer.loadLogins(filePath);
        boolean removed = logins.removeIf(login -> login.getEmployeeIC().equals(employeeIC));

        return removed && overwriteFile(logins);
    }

    // Overwrite the serialized file with the updated data
    private static boolean overwriteFile(List<EmployeeLogin> logins) {
        try {
            new java.io.File(filePath).delete(); // Delete the existing file
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
