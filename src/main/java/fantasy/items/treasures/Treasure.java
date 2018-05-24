package fantasy.items.treasures;

import fantasy.items.Item;

import java.util.ArrayList;

public class Treasure {
    private ArrayList<Item> items;

    public Treasure(){
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItemToTreasure(Item item){
        this.items.add(item);
    }

    public void removeItemFromTreasure(Item item){
        this.items.remove(item);
    }

    public void removeAllItemsFromTreasure(){
        this.items.clear();
    }
}
