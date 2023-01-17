package Locations;

import java.util.ArrayList;
import java.util.List;
public class City extends Location {
    private int robberCounter=0;
    private List<String> newsList = new ArrayList<String>();
    public City(String name) {
        super(name);
    }
    public void increaseRobberCounter() {
        robberCounter++;
        if(robberCounter >= 100) {
            newsList.add("В городе " + getName() + " появилось очень много воров!");
        }
    }
    public int getRobberCounter() {
        return robberCounter;
    }
    public List<String> getNewsList() {
        return newsList;
    }
}

