package Commands;

import Controller.CommandWithoutArg;
import Controller.Commandable;
import Controller.OrganizationCollection;

public class Exit implements CommandWithoutArg {
    String name = "exit";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) {
        System.exit(0);
    }

    @Override
    public String getName() {
        return name;
    }
}