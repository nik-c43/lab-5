package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;
import  Organization.organization;

import java.util.Map;

public class Print_unique implements Commandable {
    String name = "print_unique";
    OrganizationCollection collection = new  OrganizationCollection();

    @Override
    public void execute(Object obj) {
        LinkedHashMap<String> set = new LinkedHashMap();//коллекция не содержит дубликатов
        try {
            for (Map.Entry<Integer,  Organization> entry : collection.getCollection().entrySet())
                set.add(entry.getValue().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (set.isEmpty()) {
            System.out.println("Объеты коллекции не были найдены.");
        } else {
            System.out.println("Уникальные значения поля name");
            for (String s : set) {
                System.out.println(s);
            }
        }
    }


    @Override
    public String getName() {
        return name;
    }
}
