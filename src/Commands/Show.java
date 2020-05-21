package Commands;

import Controller.CommandWithoutArg;
import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.Organization;

import java.util.Map;
import java.util.TreeMap;

public class Show implements CommandWithoutArg {
    String name = "show";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) {
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else for (TreeMap.Entry<Integer, Organization> entry : collection.getCollection().entrySet())
            System.out.println(entry.getValue().getInfo());
    }

    @Override
    public String getName() {
        return name;
    }
}
