package Humans;

import Items.Item;
import Locations.Door;
import Locations.Home;

import java.util.List;

public interface SpecialActions {
    void hackTheDoor(Door door, List<Item> items);
    void rob(Home home);

}
