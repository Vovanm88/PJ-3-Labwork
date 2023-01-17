package Humans;

import Humans.SpecialActions;
import Items.Item;
import Locations.City;
import Locations.Door;
import MyExceptions.DoorCannotBeHackedException;

import java.util.List;

public class Robber extends Human implements SpecialActions {
    public Robber(String name, Locations.Location location, City city) {
        super(name, location, Occupation.ROBBER);
        city.increaseRobberCounter();

    }
    public void hackTheDoor(Door door, List<Item> items) throws DoorCannotBeHackedException {
        System.out.println(this.getName() +" пытается взломать дверь");
        if (items.get(0).getName().equals("Стальная проволока")) {
            door.Hack(this);
        } else {
            throw(new DoorCannotBeHackedException("Дверь не может быть взломана"));
        }
    }
    public void rob(Locations.Home home) {
        System.out.println(this.getName() + " пытается ограбить дом");
        if (home.getDoor().isOpen()) {
            System.out.println("Выносят все ценное");
        } else {
            System.out.println("Ограбление не удалось");
        }
    }
}
