package fantasy.characters;

import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;

public class Barbarian extends Warrior{
    public Barbarian(String name, int hp, int mp, Weapon weapon, Shield shield){
        super(name, hp, mp, weapon, shield);
    }
}
