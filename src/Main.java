import java.io.File;

public class Main {
    public static void main(String[] args) {

        String directoryPath = "../path/newDirectory";
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            boolean directoryCreated = directory.mkdirs();
            if (directoryCreated) {
                System.out.println("Directory created successfully.");
            } else {
                System.err.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }
}
