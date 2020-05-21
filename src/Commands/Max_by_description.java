package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;


public class Max_by_description implements CommandWithoutArg {
    String name = "max_by_description";
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object obj) {
        java.time.LocalDate maxDate = LocalDate.MIN;
        Organization organization=null;
        try {
            for (TreeMap.Entry<Integer,  Organization> entry : collection.getCollection().entrySet())
                if (entry.getValue().getCreationDate().compareTo(maxDate)>=0){
                    organization= entry.getValue();
                    maxDate = dragon.getCreationDate();
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ( organization ==null){
            System.out.println("Объеты коллекции не были найдены.");
        }
        System.out.println(organization);
    }

    @Override
    public String getName() {
        return name;
    }
}
