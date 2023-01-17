import Humans.Human;
import Humans.Occupation;
import Humans.Robber;
import Items.Item;
import Items.SteelWire;
import Live.Dog;
import Locations.*;
import MyExceptions.HaveNoOwnersException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a new location
        City city = new City("Стокгольм");

        for(int i = 0; i < 100; i++) {
            Robber r = new Robber("Вор" + i, city, city){
                @Override
                public void hackTheDoor(Door door, List<Item> items)  {
                    System.out.println("ЗАПРЕЩЕНО ВЗЛАМЫВАТЬ ДВЕРИ МАЛЫША. СЮЖЕТНАЯ БРОНЬ");
                }
            };
        }
        // Create a new home

        Home home = new Home("Дом", "Кухня", "Спальня", "Комната Малыша");

        Location landing = new Landing("Лестничная площадка", home);

        // Create a new human
        Human Karlson = new Human("Карлсон", home, Occupation.KARLSON);
        Human Malish = new Human("Малыш", home, Occupation.MALISH);



        Human Father = new Human("Папа", city, Occupation.PARENTS);
        Human Mother = new Human("Мама", city, Occupation.PARENTS);


        Human Krister = new Human.Builder("Кристер")
                .setOccupation(Occupation.SIBLINGS)
                .setLocation(home)
                .setCity(city)
                .build();
        Human Gunilla = new Human.Builder("Гунилла")
                .setOccupation(Occupation.SIBLINGS)
                .setLocation(home)
                .setCity(city)
                .build();

        Dog Effa;
        try {
            Dog dog = new Dog("Еффа", new Human[]{Malish, Mother, Father, Krister, Gunilla}, home);
            Effa = dog;
        } catch (HaveNoOwnersException e) {
            throw new RuntimeException(e);
        }


        Robber robber1 = new Robber("Филле", landing, city);
        Robber robber2 = new Robber("Рулле", landing, city);
        Item steelWire = new SteelWire(1);

        robber1.callHome(home);
        Malish.think("не буду подходить");
        Karlson.shout("принялся громко вздыхать и стонать на разные лады");

        Effa.setLocation(home.getRoom("Комната Малыша"), Krister);


        Malish.goingTo(landing, "пугать прохожих");
        Karlson.goingTo(landing, "пугать прохожих");
        Malish.heard("слабое царапанье");
        Malish.think("мама и папа возвращаются домой");
        Malish.see("в щель ящика для писем кто-то просовывает стальную проволоку");
        Malish.think("к ним лезут воры");
        Malish.remember("папа читал маме статью из газеты");


        Father.read(city);

        List<Item> items = new ArrayList<>();
        items.add(steelWire);
        robber1.callHome(home);
        robber1.hackTheDoor(home.door, items);
        robber2.rob(home);

        robber1.scare(Malish);
        robber2.scare(Krister);
        robber1.scare(Gunilla);

        Karlson.think("ничуть не испуглася");

    }
}