import java.util.Objects;

public class Location {
    final private String name;
    //override toString, equals and hashCode methods
    public Location(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location)o;
        return Objects.equals(name, location.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
