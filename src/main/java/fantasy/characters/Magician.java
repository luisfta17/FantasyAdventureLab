package fantasy.characters;

import fantasy.items.weapons.Weapon;

public  abstract class Magician extends Character {
    private Pet pet;

    public Magician(String name, int hp, int mp, Weapon weapon, Pet pet){
        super(name, hp, mp, weapon, 0);
        this.pet = pet;
    }

    public Pet getPet(){
        return this.pet;
    }

    public void basicAttack(Character character){
        character.reciveDamage(this.attackPower);
        character.reciveDamage(this.getPet().getAttackPower());
    }

    public void lightingStrike(Character character){
        if( getMp() >= 50 ){
            int total = this.getAttackPower() * 2;
            character.reciveDamage(total);
            character.reciveDamage(this.getPet().getAttackPower());
            this.reduceMp(50);
        }

    }
}
