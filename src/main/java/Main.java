import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter from: ");
        String sourceDirectory = scanner.nextLine();
        System.out.print("Enter to: ");
        String targetDirectory = scanner.nextLine();

        File from = new File(sourceDirectory);
        File to = new File(targetDirectory);
        try {
            if (from.isDirectory()) {
                FileUtils.copyDirectoryToDirectory(from, to);
            } else {
                System.out.println("Enter a valid directory!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
