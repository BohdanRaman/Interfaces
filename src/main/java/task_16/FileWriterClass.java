package task_16;

import java.util.Scanner;

public class FileWriterClass extends Char {
    public void writeCharToFile() {
        System.out.println("Enter your char:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            if (scanner.equals(Char.getCHARS())) {
                System.out.println(scanner + ";");
            } else {
                System.out.println("Please, print correct char");
            }
        }
    }
}
