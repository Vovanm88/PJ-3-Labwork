package Humans;

import Locations.City;
import Locations.Location;

public interface MentalAction {
    void think(String thought);
    void goingTo(Location location, String message);
    void heard(String message);
    void see(String message);
    void remember(String message);
    void read(City city);
}
