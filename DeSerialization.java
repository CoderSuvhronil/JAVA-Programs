import java.io.*;
import java.util.*;

class CurrentTime implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date time;

    public CurrentTime() {
        this.time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }
}

public class DeSerialization {
    public static void main(String[] args) {
        String fileName = "time.txt"; 
        CurrentTime t = null;

        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fis)) {
            t = (CurrentTime) in.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        // Print out restored time
        if (t != null) {
            System.out.println("Previously Stored time: " + t.getTime());
        } else {
            System.out.println("No time data available in file.");
        }

        // Print out the current time
        System.out.println("Current time: " + Calendar.getInstance().getTime());
    }
}