package Commands;

import Controller.CommandWithObject;
import Controller.Commandable;
import Controller.Commands;
import Controller.OrganizationCollection;
import Utilites.ReaderFromFile;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Execute_script implements Commandable {
    String name = "execute_script";
    OrganizationCollection collection = new OrganizationCollection();
    ReaderFromFile reader = new ReaderFromFile();
    Commands invoker = new Commands();

    @Override
    public void execute(Object arg) {
        try {
            String data = reader.readFromFile((String) arg);
            Commands command = new Commands();
            if (data != null) {
                String[] commands = data.split("\n|\r\n");
                for (int i = 0; i < commands.length; i++) {
                    if (!(commands[i].equals(""))) {
                        if (!(commands[i].equals("execute_script " + arg))) {
                            try {
                                String[] commandAndName = commands[i].split(" ");
                                CommandWithObject commandWithObject = (CommandWithObject) invoker.getCommand(commandAndName[0]);
                                if (commandWithObject != null) {
                                    ArrayList<String> params = new ArrayList<>();
                                    try {
                                        for (int j = 0; j < 11; j++) {
                                            i++;
                                            params.add(commands[i]);
                                        }
                                        Organization.isFromScript = true;
                                        Organization creater = new  Organization();
                                        creater.createFromFile(params);
                                        System.out.println("\nКоманда \"" + commands[i-11] + "\":");
                                        command.executeCommand(commands[i-11]);
                                        Organization.isFromScript = false;
                                    } catch (IndexOutOfBoundsException e) {
                                        System.out.println("Команда \"" + commandAndName + "\":");
                                        System.out.println("Недостаточно параметров");
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("Команда \"" + commands[i] + "\":");
                                command.executeCommand(commands[i]);
                                System.out.println();
                            }

                        } else System.out.println("Команда \"" + commands[i] + "\": невыполнима.");
                    }
                }
            } else System.out.println("Указанный файл не найден.");
        } catch (NullPointerException | FileNotFoundException e) {

        }
    }

    @Override
    public String getName() {
        return name;
    }
}
