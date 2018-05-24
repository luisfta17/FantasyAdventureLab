package fantasy.characters;

import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;

public  abstract class Warrior extends Character {

    private Shield shield;

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
        if( getMp() >= 50 ){
            int total = this.getAttackPower() * 2;
            character.reciveDamage(total);
            this.reduceMp(50);
        }

    }
}
    
