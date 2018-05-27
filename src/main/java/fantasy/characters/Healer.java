package fantasy.characters;

import fantasy.items.weapons.Weapon;

public abstract class Healer extends Character {
    public Healer(String name, int hp, int mp, Weapon weapon){
        super(name, hp, mp, weapon, 0, weapon.getHealingPower());
    }


    public void superHeal(Character character){
        if( getMp() >= 50 ){
            int total = this.getHealingPoints() * 2;
            character.healHp(total);
            character.healMp(total);
            this.reduceMp(50);
        }

    }
}
