package fantasy.characters;

import fantasy.items.Item;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Weapon;

import java.util.ArrayList;

public abstract class Character {

    protected String name;
    protected int hp;
    protected ArrayList<Item> inventory;
    protected Weapon weapon;
    protected int attackPower;
    protected int defensePoints;


    public Character(String name, int hp, Weapon weapon, int defensePoints){
        this.name = name;
        this.hp = hp;
        this.inventory = new ArrayList<>();
        this.weapon = weapon;
        this.attackPower = weapon.getAttackPower();
        this.defensePoints = defensePoints;

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

    public void reciveDamage(int damage){
        if (damage > this.defensePoints){
            int total = damage - this.defensePoints;
            this.hp -= total;
        }
        
    }

//        for (int i = 0; i < treasure.getItems().size(); i++){
//            Item item = treasure.getItems().get(i);
//            this.addItem(item);
//        }
//        treasure.removeAllItemsFromTreasure();
//    }






}

