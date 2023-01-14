// class Human with name, scared flag, location and actions and occupation and implements mentalAction and PhysicalAction

import java.util.List;
import java.util.Objects;

public class Human implements mentalAction, physAction{
    String name;
    private boolean scared;
    private Location location;
    private Occupation occupation;

    public Human(String name, Location location, Occupation occupation) {
        this.name = name;
        this.location = location;
        this.occupation = occupation;
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
        System.out.println(name + " звонит домой");
    }
    public void readSomething(String message) {
        System.out.println(name + " читает: " + message);
    }
    // override toString, hashCode, equals
    @Override
    public String toString() {
        return "Human{" +
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


