package lab_5_proga;

public class Address {
    private String zipCode; //Длина строки должна быть не меньше 7, Поле может быть null
    private Location town; //Поле не может быть null

    public Address(String zipCode, Location town) {
        this.zipCode = zipCode;
        this.town = town;
    }
}
