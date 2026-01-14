package mini_project_1;

import java.io.*;

public class FileUtility {

    private static final String FILE_NAME = "accounts.dat";

    public static void saveAccount(BankAccount account) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(account);
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    public static BankAccount loadAccount() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (BankAccount) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
