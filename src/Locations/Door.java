package Locations;

import Humans.Human;
import Humans.Occupation;

public class Door {
    private boolean isOpen;
    private boolean hacked=false;
    private boolean isLocked;
    public Door(boolean isOpen, boolean isLocked) {
        this.isOpen = isOpen;
        this.isLocked = isLocked;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void Open() {
        if (isLocked && !hacked) {
            System.out.println("Дверь заперта");
        } else {
            isOpen = true;
        }
    }
    public void Close() {
        isOpen = false;
    }
    public void Hack(Human hacker) {
        if (hacker.getOccupation() == Occupation.ROBBER) {
            hacked = true;
            System.out.println("Дверь успешно взломана");
        } else {
            System.out.println("Взломать дверь не удалось");
        }
    }
}
