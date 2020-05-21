package Commands;

import Controller.CommandWithObject;
import Controller.DragonCollection;
import  Organization. Organization;
import Organization. Organizator;

import java.util.InputMismatchException;

public class Update implements CommandWithObject {
    String name = "update";
    Organizator creater = new  Organizator();
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object arg) {
        try {
            int id = Integer.parseInt((String) arg);
            if (this.check(id)) {
                Organization organization = this.getNewOrganization(null);
                if (organization != null) {
                    organization.setId(id);
                    collection.update((Integer) id, organization);
                    System.out.println("Дракон с id[" + arg + "] успешно обновлен.");
                }
            } else System.out.println("Organization с указанным id не найден.");
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
        return !collection.isKeyFree((Integer) arg);
    }

    @Override
    public Organization getNewOrganization(Object params) {
        if (Organizator.isFromScript == false) return creater.create();
        else return Organizator.organizationFromScript;
    }
}

