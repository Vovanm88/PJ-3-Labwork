package Locations;// Locations.Home class extends Locations.Location class and contains a door

import MyExceptions.RoomDoesntExistException;

import java.util.HashMap;
import java.util.Map;

public class Home extends Location {
    final public Door door;



    public class Room extends Location{
        final private Home flat;
        public Room(String name, Home flat) {
            super(name);
            this.flat = flat;
        }
        public Home getFlat() {
            return flat;
        }
    }
    //map of rooms
    private Map<String, Room> rooms=new HashMap<>();;

    public Home(String name, String ... rooms) {
        super(name);
        this.door = new Door(false, true);
        for (String room : rooms) {
            this.rooms.put(room, new Room(room, this));
        }
    }
    public Door getDoor() {
        return door;
    }
    public Map<String, Room> getRooms() {
        return rooms;
    }
    public Room getRoom(String roomName) throws RoomDoesntExistException {
        if(rooms.containsKey(roomName)) {
            return rooms.get(roomName);
        } else {
            throw(new RoomDoesntExistException("Такой комнаты нет"));
        }

    }
    public void addRoom(String roomName) {
        rooms.put(roomName, new Room(roomName, this));
    }
    public void removeRoom(String roomName) {
        rooms.remove(roomName);
    }

}
