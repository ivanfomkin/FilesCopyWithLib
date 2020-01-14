import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            for (; ; ) {
                File from = getDirectoryFile("source");
                File to = getDirectoryFile("target");
                FileUtils.copyDirectoryToDirectory(from, to);
                System.out.println("Copying successful");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static File getDirectoryFile(String purpose) {
        String destination = purpose.equalsIgnoreCase("source") ? "source" : "target";
        File directoryFile;
        for (; ; ) {
            System.out.print("Enter " + destination + " directory: ");
            String directoryPath = scanner.nextLine();
            directoryFile = new File(directoryPath);
            if (directoryFile.exists() && directoryFile.isDirectory()) {
                return directoryFile;
            } else {
                System.out.println("Directory is not valid!");
                continue;
            }
        }
    }
}
