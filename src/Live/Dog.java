package Live;

import Humans.Human;
import Locations.Location;
import MyExceptions.HaveNoOwnersException;

public class Dog {
    final public String name;
    final public Human[] owners;
    private Locations.Location location;
    public Dog(String name, Human[] owners, Location location) throws HaveNoOwnersException {
        this.name = name;
        if (owners.length == 0) {
            throw new HaveNoOwnersException("У собаки должен быть хотя бы один хозяин");
        }
        this.owners = owners;
        this.location = location;
    }
    public Locations.Location getLocation() {
        return location;
    }
    public void setLocation(Locations.Location location, Human human){
        this.location = location;
        //check if human is owner
        for (Human owner : owners) {
            if (owner.equals(human)) {
                System.out.println("Собака " + name + " теперь находится в " + location);
                return;
            }
        }

    }
    public void bark() {
        System.out.println(name + " лает");
    }
}
