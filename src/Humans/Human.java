package Humans;// class Humans.Human with name, scared flag, location and actions and occupation and implements mentalAction and PhysicalAction

import Live.Dog;
import Locations.City;
import Locations.Home;
import Locations.Location;

import java.util.Objects;

public class Human implements MentalAction, PhysAction {
    private String name;
    private boolean scared;
    private Location location;
    private Occupation occupation;

    public Human(String name, Location location, Occupation occupation) {
        this.name = name;
        this.location = location;
        this.occupation = occupation;
    }
    public String getName(){
        return name;
    }
    public Occupation getOccupation() {
        return occupation;
    }
    public void think(String thought) {
        System.out.println(name + " подумал, что  " + thought);
    }
    public void heard(String message) {
        System.out.println(name + " услышал " + message);
    }
    public void goingTo(Location location, String message) {
        System.out.println("Собирались выйти на " + location + " и " + message);
    }
    public void read(City city) {
        String message = city.getNewsList().get(city.getNewsList().size() - 1);
        System.out.println(name + " прочитал: " + message);
    }
    public void see(String message) {
        System.out.println(name + " увидел, что " + message);
    }
    public void remember(String message) {
        System.out.println(name + " вспомнил, что " + message);
    }
    public void shout(String message) {
        System.out.println(name + " " + message);
    }
    public void scare(Human human) {
        if (human.scared) {
            System.out.println("Человек уже испуган");
        } else {
            human.scared = true;
            System.out.println("Испугал " + human.name);
        }
    }
    public void callHome(Home home) {
        class Phone {
            public void call(Home home) {
                System.out.println("Телефон звонит в дом " + home);
            }
        }
        Phone phone = new Phone();
        phone.call(home);
    }
    public void readSomething(String message) {
        System.out.println(name + " читает: " + message);
    }
    //static Builder class
    public static class Builder {
        private String name;
        private Location location;
        private Occupation occupation;
        private City city;

        public Builder(String name) {
            this.name = name;
        }
        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }
        public Builder setOccupation(Occupation occupation) {
            this.occupation = occupation;
            return this;
        }
        public Builder setCity(City city) {
            this.city = city;
            return this;
        }
        public Human build() {
            if(occupation == Occupation.ROBBER)
                return new Robber(name, location, city);
            return new Human(name, location, occupation);
        }
    }
    public void moveDog(Dog dog, Location location) {
        dog.setLocation(location, this);
    }
    
    
    // override toString, hashCode, equals
    @Override
    public String toString() {
        return "Humans.Human{" +
                "name='" + name + '\'' +
                ", scared=" + scared +
                ", location=" + location +
                ", occupation=" + occupation +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode() + location.hashCode() + occupation.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return scared == human.scared &&
                Objects.equals(name, human.name) &&
                Objects.equals(location, human.location) &&
                occupation == human.occupation;
    }
}


