package Controller;

import Organization.Organization;

public interface CommandWithObject extends Commandable{
    public boolean check(Object arg);
    public Organization getNewDragon(Object params);
}
