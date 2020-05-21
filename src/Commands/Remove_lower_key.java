package Commands;

import Controller.Commandable;
import Controller.DragonCollection;
import Organization.Organization;

import java.util.Enumeration;
import java.util.TreeMap;
import java.util.InputMismatchException;

public class Remove_lower_key implements Commandable {
    OrganizationCollection collection = new  OrganizationCollection();
    String name = "remove_lower_key";

    @Override
    public void execute(Object arg) {
        try {
            boolean tumb = false;
            if (collection.getSize() == 0) System.out.println("Коллекция итак пустая.");
            else {
                TreeMap<Integer,  Organization>   organization= collection.getCollection();
                Enumeration keys = organization .keys();
                while (keys.hasMoreElements()) {
                    Integer k = (Integer) keys.nextElement();
                    Organization v =  organization.get(k);
                    if (v.getId() < Integer.parseInt((String) arg)) {
                        tumb = true;
                        collection.remove(k);
                        System.out.println("Организация с id:[" + k + "] успешно удалена.");
                    }
                }
                if (!tumb) System.out.println("Организаций с меньшим id не найдено.");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
