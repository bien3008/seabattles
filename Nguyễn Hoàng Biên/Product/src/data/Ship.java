package data;

import java.util.ArrayList;

public class Ship {
    private int size;
    private int quantity;
    private boolean ruined;
    private int wasHit;
    private ArrayList<int[]> coordinates = new ArrayList<>();
    public Ship(int size,int quantity) {
        this.size = size;
        this.ruined = false;
        this.wasHit = 0;
        this.quantity = quantity;
    }

    public ArrayList<int[]> getCoordinate() {
        return coordinates;
    }

    public int getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isRuined() {
        return ruined;
    }

    public int getWasHit() {
        return wasHit;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRuined(boolean ruined) {
        this.ruined = ruined;
    }

    public void setWasHit(int wasHit) {
        this.wasHit = wasHit;
    }
}
