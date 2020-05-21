package Organization;

import java.time.ZonedDateTime;

public class Organization implements Comparable {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 1718, Поле может быть null
    private int employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address officialAddress; //Поле не может быть null
    /*
    public Organization( String name, Coordinates coordinates, int annualTurnover, String fullName, int employeesCount, OrganizationType type, Address officialAddress) {
        this.id = CreateId();
        this.name = name;
        this.coordinates = coordinates;
        ZonedDateTime t = ZonedDateTime.now();
        this.creationDate = t;
        this.annualTurnover = annualTurnover;
        this.fullName = fullName;
        this.employeesCount = employeesCount;
        this.type = type;
        this.officialAddress = officialAddress;
    }
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(int annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public OrganizationType getType() {
        return type;
    }

    public void setType(OrganizationType type) {
        this.type = type;
    }

    public Address getOfficialAddress() {
        return officialAddress;
    }

    public void setOfficialAddress(Address officialAddress) {
        this.officialAddress = officialAddress;
    }
    public String getInfo(){
        return "Organization (id: " + id + "]\n\t" + "Name: " + name + "\n\tAddress: " + officialAddress.getTown() +
                "\n\tZIPcod: " + officialAddress.getZipCode() + "\n\tCoordinates:\n\tx " + coordinates.getX() + "\n\ty"
                + coordinates.getY() + "\n\tcreation date: " + creationDate + "\n\tannual turnover" + annualTurnover +
                "\n\tfull name: " + fullName + "\n\temployees count: " + employeesCount + "\n\torganization type: " + type;}
    // remake work with collections


    @Override
    public int compareTo(Object o) {
        return this.getInfo().length() - ((Organization) o).getInfo().length();
    }
}
