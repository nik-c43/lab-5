package Utilites;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFromFile {

    public String readFromFile(String filename) throws FileNotFoundException {
        try {
            String data = "";
            File file = new File(filename);
            //List<String> strings = new ArrayList<String>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                data += scanner.nextLine().trim() + "\n";
            scanner.close();
            WriterToFile.setFilename(filename);
            return data;
        } catch (FileNotFoundException | NullPointerException e) {
            while (filename == (null)) {
                System.out.println("Вы забыли указать имя файла. Укажите имя файла сейчас:");
                String newFilename = Console.read();
                if (!(newFilename.equals(""))) {
                    WriterToFile.setFilename(filename);
                    break;
                }
            }
            return null;
        }
    }
}