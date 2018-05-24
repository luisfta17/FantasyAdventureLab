package fantasy.characters;

import fantasy.items.potion.Potion;
import fantasy.items.weapons.Shield;

public  abstract class Warrior extends Character {
    private int mp;
    private Shield shield;

    public Warrior(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
        this.shield = null;
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
        character.reciveDamage(this.weapon.getAttackPower());
    }

    public void megaStrike(Character character){
        if( this.mp >= 50 ){
            character.reciveDamage(this.weapon.getAttackPower() * 2);
            this.reduceMp(50);
        }

    }
}
    
