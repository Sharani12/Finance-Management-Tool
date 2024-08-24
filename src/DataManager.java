import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataManager {
    private static final String FILE_PATH = "user_data.ser";
    private static final Logger logger = Logger.getLogger(DataManager.class.getName());

    public static void saveData(List<Income> incomes, List<Expense> expenses) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            UserData data = new UserData(incomes, expenses);
            out.writeObject(data);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error saving data", e);
        }
    }

    public static UserData loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (UserData) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.SEVERE, "Error loading data", e);
            return new UserData();
        }
    }
}





