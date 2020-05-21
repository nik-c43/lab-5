package Commands;

import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.Organization;

import java.util.TreeMap;

public class Remove_key implements Commandable {
    String name = "remove_key";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object arg) {
        try {
            boolean tumb = false;
            if (collection.getSize() == 0) System.out.println("Коллекция итак пустая.");
            else {
                /*
                for (TreeMap.Entry<Integer, Organization> entry : collection.getCollection().entrySet())
                    if (entry.getKey() == Integer.parseInt((String) arg)) {
                        tumb = true;
                        collection.remove(entry.getKey());
                        System.out.println("Элемент с id[" + arg + "] успешно удален.");

                  я хз, как это должно работать
                 */
                collection.remuve(Integer.parseInt((String) arg)); //это - костыль
                if (!tumb) System.out.println("Дракон с указанным id не найден.");
            }
        } catch (Exception e) {
            System.out.println("Аргумент команды должен быть типа \"int\"");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

