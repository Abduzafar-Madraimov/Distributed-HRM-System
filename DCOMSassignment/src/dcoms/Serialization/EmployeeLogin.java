package dcoms.Serialization;

import java.io.Serializable;

public class EmployeeLogin implements Serializable {
    private static final long serialVersionUID = 1L;

    private String employeeIC;
    private String password;

    public EmployeeLogin() {
        
    }

    // Getters
    public String getEmployeeIC() {
        return employeeIC;
    }

    public String getPassword() {
        return password;
    }
    
    // Setter for updating the password
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Setter for updating the IC
    public void setIC(String IC) {
        this.employeeIC = IC;
    }


}
