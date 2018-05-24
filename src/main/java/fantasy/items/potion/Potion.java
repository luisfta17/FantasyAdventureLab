package fantasy.items.potion;

import fantasy.items.Item;

public class Potion extends Item{

    private int hpRecovery;
    private int mpRecovery;

    public Potion(String name, int hpRecovery, int mpRecovery){
        super(name);
        this.hpRecovery = hpRecovery;
        this.mpRecovery = mpRecovery;
    }

    public int getHpRecovery() {
        return this.hpRecovery;
    }

    public int getMpRecovery() {
        return this.mpRecovery;
    }
}
