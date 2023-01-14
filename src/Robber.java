import java.util.List;

public class Robber extends Human implements specialActions{
    public Robber(String name, Location location, City city) {
        super(name, location, Occupation.ROBBER);
        city.increaseRobberCounter();

    }

    public void hackTheDoor(Door door, List<Item> items) {
        System.out.println(this.name +" пытается взломать дверь");
        if (items.get(0).getName() == "Стальная проволока") {
            door.Hack(this);
        } else {
            System.out.println("Взломать дверь не удалось");
        }
    }
}
