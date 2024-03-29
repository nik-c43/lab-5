package Commands;

import Controller.CommandWithObject;
import Controller.OrganizationCollection;
import Organization.Organization;
import Organization.OrganizationType;

import java.util.InputMismatchException;

public class Insert implements CommandWithObject {
    String name = "insert";
    OrganizationCollection collection = new OrganizationCollection();
    OrganizationType creater = new OrganizationType();

    @Override
    public void execute(Object arg) {
        try {
            int id = Integer.parseInt((String) arg);
            if (this.check(id)) {
                Organizationorganization = this.getNewOrganization(null);
                organization.setId(id);
                collection.insert((Integer) id, organization);
                System.out.println(" залетел в коллекцию.");
            } else System.out.println("Указанный ключ занят");
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Аргумент команды должен быть типа \"int\"");
        }
        catch (NullPointerException e){
            System.out.println("Неверно указаны данные.");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean check(Object arg) {
        return collection.isKeyFree((Integer) arg);
    }

    @Override
    public Organization getNewOrganization(Object params) {
        if (OrganizationType.isFromScript == false) return creater.create();
        else return OrganizationType.OrganizationFromScript;
    }
}

