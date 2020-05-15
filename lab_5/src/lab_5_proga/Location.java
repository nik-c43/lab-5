package lab_5_proga;

class Location {
    private float x; //Поле не может быть null
    private float y; //Поле не может быть null
    private float z;
    private String name; //Поле не может быть null

    public Location(float x, float y, float z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
}
