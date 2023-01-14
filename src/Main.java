import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a new location
        City city = new City("Стокгольм");
        // Create a new home

        Home home = new Home("Дом");
        home.door = new Door(false, true);
        Location landing = new Landing("Лестничная площадка", home);

        // Create a new human
        Human Karlson = new Human("Карлсон", home, Occupation.KARLSON);
        Human Malish = new Human("Малыш", home, Occupation.MALISH);
        Human Father = new Human("Папа", city, Occupation.PARENTS);
        Human Mother = new Human("Мама", city, Occupation.PARENTS);

        Robber robber1 = new Robber("Филле", landing, city);
        Robber robber2 = new Robber("Рулле", landing, city);

        Item steelWire = new SteelWire(1);

        // Create a new list of items
        List<Item> items = new ArrayList<>();
        items.add(steelWire);
        robber1.hackTheDoor(home.door, items);
        /*/
        Между тем Карлсон принялся громко вздыхать и стонать на разные лады.
        На все эти приготовления ушло немало времени. Когда они уже стояли перед входной дверью и собирались
        выйти на лестничную площадку, чтобы пугать прохожих, послышалось какое-то слабое царапанье.
        Малыш было подумал, что это мама и папа возвращаются домой.
        Но вдруг он увидел, как в щель ящика для писем кто-то просовывает стальную проволоку.
        И Малыш сразу понял, что к ним лезут воры. Он вспомнил, что на днях папа читал маме статью из газеты.
        Там говорилось, что в городе появилось очень много квартирных воров. Они сперва звонят по телефону.
        Убедившись, что дома никого нет, воры взламывают замок и выносят из квартиры все ценное.
         */
        Karlson.shout("принялся громко вздыхать и стонать на разные лады");
        Malish.goingTo(landing, "пугать прохожих");
        Karlson.goingTo(landing, "пугать прохожих");
        Malish.heard("слабое царапанье");
        Malish.think("мама и папа возвращаются домой");
        Malish.see("в щель ящика для писем кто-то просовывает стальную проволоку");
        Malish.think("к ним лезут воры");
        Malish.remember("папа читал маме статью из газеты");

        Father.read(city);

        robber1.callHome(home);

        robber2.hackTheDoor(home.door, items);

    }
}