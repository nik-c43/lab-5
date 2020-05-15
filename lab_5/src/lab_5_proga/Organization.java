package lab_5_proga;

import java.time.ZonedDateTime;

public class Organization {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 1718, Поле может быть null
    private int employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address officialAddress; //Поле не может быть null

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

    public int getId() {
        return id;
    }
    private int CreateId (){
        id = (int) (Math.random()*1000);
        if(Main.treemap.containsKey(id)){
            CreateId();
        }
        return id;
    }
}
