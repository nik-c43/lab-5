package lab_5_proga;

import java.util.Scanner;

public class Reader {
    static public String ConsoleReader() {
        System.out.println("Enter command:");
        String buf;
        Scanner in = new Scanner(System.in);
        buf = in.nextLine();
        if(buf.length() <1){
            return ConsoleReader();
        }
        return buf;
    }
}
