package fantasy.characters;

import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Weapon;

import java.util.ArrayList;

public abstract class Character {

    protected String name;
    protected int hp;
    protected int mp;
    protected ArrayList<Item> inventory;
    protected Weapon weapon;
    protected int attackPower;
    protected int defensePoints;


    public Character(String name, int hp, int mp, Weapon weapon, int defensePoints){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
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

    public int getMp() {
        return this.mp;
    }

    public void reduceMp(int reduce) {
        this.mp -= reduce;
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

    public int defenseFormula(){
        return this.defensePoints / 2;
    }

    public void reciveDamage(int damage){
        if (damage >= this.defenseFormula()){
            int total = damage - this.defenseFormula();
            this.hp -= total;
            if (this.hp < 0){
                this.hp = 0;
            }
        }


    }

    public void drinkPotion(Potion potion){
        this.hp += potion.getHpRecovery();
        this.mp += potion.getMpRecovery();
        this.attackPower += potion.getAttackPower();
        this.defensePoints += potion.getDefensePoints();
    }

    public void basicAttack(Character character){
        character.reciveDamage(this.attackPower);
    }

    public boolean isAlive(){
        return this.getHp() > 0;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getDefensePower() {
        return this.defensePoints;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

//        for (int i = 0; i < treasure.getItems().size(); i++){
//            Item item = treasure.getItems().get(i);
//            this.addItem(item);
//        }
//        treasure.removeAllItemsFromTreasure();
//    }






}

