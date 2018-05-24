package fantasy.characters;

import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;

public  abstract class Warrior extends Character {
    private int mp;
    private Shield shield;
    private int defensePoints;

    public Warrior(String name, int hp, int mp, Weapon weapon, Shield shield){
        super(name, hp, mp, weapon, shield.getDefensePower());
        this.shield = shield;
    }

    public Shield getShield() {
        return this.shield;
    } 
    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void megaStrike(Character character){
        if( this.mp >= 50 ){
            character.reciveDamage(this.attackPower * 2);
            this.reduceMp(50);
        }

    }
}
    
