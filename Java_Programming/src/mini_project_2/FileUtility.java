package mini_project_2;

import java.io.*;
import java.util.ArrayList;

public class FileUtility {

    private static final String FILE_NAME = "employees.dat";

    public static void save(ArrayList<Employee> list) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }

    public static ArrayList<Employee> load() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
