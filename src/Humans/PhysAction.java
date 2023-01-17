package Humans;

import Live.Dog;
import Locations.Home;
import Locations.Location;

public interface PhysAction {
    void shout(String message);
    void scare(Human human);
    void callHome(Home home);
    void readSomething(String message);
    void moveDog(Dog dog, Location location);

}
