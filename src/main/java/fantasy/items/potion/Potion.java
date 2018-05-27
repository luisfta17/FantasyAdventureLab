package fantasy.items.potion;

import fantasy.items.Item;

public class Potion extends Item{

    private int hpRecovery;
    private int mpRecovery;
    private int attackPower;
    private int defensePoints;

    public Potion(String name, int hpRecovery, int mpRecovery, int attackPower, int defensePoints){
        super(name);
        this.hpRecovery = hpRecovery;
        this.mpRecovery = mpRecovery;
        this.attackPower = attackPower;
        this.defensePoints = defensePoints;
    }

    public int getHpRecovery() {
        return this.hpRecovery;
    }

    public int getMpRecovery() {
        return this.mpRecovery;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getDefensePoints() {
        return this.defensePoints;
    }
}
