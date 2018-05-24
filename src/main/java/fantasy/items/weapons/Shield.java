package fantasy.items.weapons;

import fantasy.items.Item;

public class Shield extends Item {

    private int defensePower;

    public Shield(String name, int defensePower){
        super(name);
        this.defensePower = defensePower;
    }

    public int getDefensePower(){
       return  this.defensePower;
    }

}
