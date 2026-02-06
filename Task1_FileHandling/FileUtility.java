import java.io.*;

public class FileUtility {

    public static void main(String[] args) {

        String fileName = "data.txt";

        try {

            System.out.println("===== FILE HANDLING UTILITY =====\n");

            // WRITE
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: Tushar Shinde\n");
            writer.write("Task: File Handling Utility\n");
            writer.write("Status: File Created and Written\n");
            writer.close();

            System.out.println("1. File written successfully.");

            // READ
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\n2. Reading file content:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            // MODIFY (append)
            FileWriter modify = new FileWriter(fileName, true);
            modify.write("Status: File Modified Successfully\n");
            modify.close();

            System.out.println("\n3. File modified successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
