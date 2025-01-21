package dcoms.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeLoginDeserializer {
    public static List<EmployeeLogin> loadLogins(String filePath) {
        List<EmployeeLogin> logins = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                try {
                    EmployeeLogin login = (EmployeeLogin) ois.readObject();
                    logins.add(login);
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logins;
    }
}