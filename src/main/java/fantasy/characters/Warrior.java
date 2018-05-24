package fantasy.characters;

import fantasy.items.potion.Potion;
import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;

public  abstract class Warrior extends Character {
    private int mp;
    private Shield shield;
    private int defensePoints;

    public Warrior(String name, int hp, int mp, Weapon weapon, Shield shield){
        super(name, hp, weapon, shield.getDefensePower());
        this.mp = mp;
        this.shield = shield;
    }

    public int getMp() {
        return this.mp;
    }

    public void reduceMp(int reduce) {
        this.mp -= reduce;
    }

    public Shield getShield() {
        return this.shield;
    } 
    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void drinkPotion(Potion potion){
        this.hp += potion.getHpRecovery();
        this.mp += potion.getMpRecovery();
    }

    public void basicAttack(Character character){
        character.reciveDamage(this.attackPower);
    }

    public void megaStrike(Character character){
        if( this.mp >= 50 ){
            character.reciveDamage(this.attackPower * 2);
            this.reduceMp(50);
        }

    }
}
    
