package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;
import Organization.Organization;
import Organization.OrganizationType;

import java.util.TreeMap;

public class Сount_by_type implements CommandWithoutArg {
    String name = "count_by_type";
    OrganizationCollection collection = new OrganizationCollection();


    @Override
    public void execute(Object obj) {
        OrganizationType type;
        int counter = 0;
        try {
            type = OrganizationType.valueOf((String) obj);
        } catch (Exception e) {
            System.out.println("Цвет " + (String) obj + " не существует.");
            return;
        }
        try {
            for (TreeMap.Entry<Integer, Organization> entry : collection.getCollection().entrySet())
                if (entry.getValue().getColor() == type) {
                    counter++;
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Всего найдено " + counter + " объектов");
    }


    @Override
    public String getName() {
        return name;
    }
}

