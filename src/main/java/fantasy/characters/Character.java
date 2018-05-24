package fantasy.characters;

import fantasy.items.Item;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Weapon;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Character {

    private String name;
    private int hp;
    private ArrayList<Item> inventory;
    private Weapon weapon;


    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.inventory = new ArrayList<>();
        this.weapon = null;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public int getHp() {
        return this.hp;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void addItem(Item item){
        this.inventory.add(item);
    }

    public void removeItem(Item item){
        this.inventory.remove(item);
    }

    public void collectTreasure(Treasure treasure) {
        for (Item item : treasure.getItems()) {
            this.addItem(item);
        }
        treasure.removeAllItemsFromTreasure();
    }
//        for (int i = 0; i < treasure.getItems().size(); i++){
//            Item item = treasure.getItems().get(i);
//            this.addItem(item);
//        }
//        treasure.removeAllItemsFromTreasure();
//    }
}

