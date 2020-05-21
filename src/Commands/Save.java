package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;
import Organization.Organization;
import Utilites.WriterToFile;

import java.io.FileNotFoundException;
import java.util.Map;

public class Save implements CommandWithoutArg {
    String name = "save";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) throws FileNotFoundException {
            WriterToFile.write OrganizationToFile(collection.getCollection());

        System.out.println("Коллекция успешно сохранена.");
    }


    @Override
    public String getName() {
        return name;
    }
}

