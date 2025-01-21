package dcoms.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeLoginSerializer {
    public static boolean saveLogin(EmployeeLogin login, String filePath) {
        File file = new File(filePath);
        boolean append = file.exists() && file.length() > 0; // Check if file exists and has data

        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = append
                ? new AppendableObjectOutputStream(fos) // Use custom stream to avoid writing header
                : new ObjectOutputStream(fos)) {
            oos.writeObject(login);
            return true; // Return true if saving is successful
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Return false if an exception occurs
        }
    }
}