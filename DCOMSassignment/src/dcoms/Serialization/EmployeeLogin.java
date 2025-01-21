package dcoms.Serialization;

import java.io.Serializable;

public class EmployeeLogin implements Serializable {
    private static final long serialVersionUID = 1L;

    private String employeeIC;
    private String password;

    public EmployeeLogin(String employeeIC, String password) {
        this.employeeIC = employeeIC;
        this.password = password;
    }

    // Getters
    public String getEmployeeIC() {
        return employeeIC;
    }

    public String getPassword() {
        return password;
    }
}
