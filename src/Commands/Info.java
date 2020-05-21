package Commands;

import Controller.*;


public class Info implements CommandWithoutArg {
    String name = "info";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) {
        System.out.println(collection.getInfo());
    }

    @Override
    public String getName() {
        return name;
    }
}
