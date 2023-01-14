// Home class extends Location class and contains a door

public class Home extends Location{
    public Door door;
    public Home(String name) {
        super(name);
        this.door = new Door(false, true);
    }
}
