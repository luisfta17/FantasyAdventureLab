package fantasy.items.weapons;

import fantasy.items.Item;

public class Weapon extends Item {

    private int attackPower;
    private int healingPower;

    public Weapon(String name, int attackPower, int healingPower){
        super(name);
        this.attackPower = attackPower;
        this.healingPower = healingPower;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getHealingPower() {
        return this.healingPower;
    }
}
