package Items;// abstract class that contains name, value and overrides toString, equals and hashCode methods

import java.util.Objects;

public abstract class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Items.Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item)o;
        return value == item.value &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+ value;
    }
}