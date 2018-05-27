import fantasy.characters.*;
import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Barbarian barbarian1, barbarian2;
    Wizard wizard1;
    Shield shield, shield2;
    Weapon weapon, weapon2, weapon3, weapon4;
    Treasure treasure;
    Item item1, item2;
    Potion potion;
    Pet pet;

    @Before
    public void before() {
        pet = new Unicorn(20);
        shield = new Shield("Trinity", 20);
        shield2 = new Shield("Trinity2", 220);
        weapon = new Weapon("Axe", 45, 0);
        weapon2 = new Weapon("Sword", 50, 0);
        weapon3 = new Weapon("Wand", 50, 0);
        weapon4 = new Weapon("Wand", 25, 50);
        barbarian1 = new Barbarian("Hannah", 100, 70, weapon, shield);
        barbarian2 = new Barbarian("Luis", 100, 70, weapon2, shield);
        wizard1 = new Wizard("Finn", 80, 150, weapon3, pet);
        cleric = new Cleric("Priest", 80, 150, weapon4);
        item1 = new Weapon("Axe", 10, 0);
        item2 = new Potion("HP pot", 100, 0, 0, 0);
        potion = new Potion("HP pot", 100, 0, 0, 0);
        treasure = new Treasure();
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
    }


    @Test
    public void hasName(){
        assertEquals("Priest", cleric.getName());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(25, cleric.getAttackPower());
    }

    @Test
    public void hasDefensePower(){
        assertEquals(0, cleric.getDefensePower());
    }
    @Test
    public void hasHealingPower(){
        assertEquals(50, cleric.getHealingPoints());
    }

    @Test
    public void hasHP(){
        assertEquals(80, cleric.getHp());
    }

    @Test
    public void hasMP(){
        assertEquals(150, cleric.getMp());
    }

    @Test
    public void hasInventory(){
        assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void canCollectTreasure(){
        cleric.collectTreasure(treasure);
        assertEquals(2, cleric.getInventory().size());
        assertEquals(0, treasure.getItems().size());
    }

    @Test
    public void canBasicAttack(){
        cleric.basicAttack(barbarian2);
        assertEquals(85, barbarian2.getHp());

    }

    @Test
    public void canSuperHeal(){
        barbarian1.megaStrike(barbarian2);
        assertEquals(20, barbarian2.getHp());
        cleric.superHeal(barbarian2);
        assertEquals(100, barbarian2.getHp());
        assertEquals(100, cleric.getMp());

    }


}
