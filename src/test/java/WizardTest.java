import fantasy.characters.Barbarian;
import fantasy.characters.Pet;
import fantasy.characters.Unicorn;
import fantasy.characters.Wizard;
import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

        Barbarian barbarian1, barbarian2;
        Wizard wizard1;
        Shield shield, shield2;
        Weapon weapon, weapon2, weapon3;
        Treasure treasure;
        Item item1, item2;
        Potion potion;
        Pet pet;

        @Before
        public void before(){
            pet = new Unicorn(10);
            shield = new Shield("Trinity", 20);
            shield2 = new Shield("Trinity2", 220);
            weapon = new Weapon("Axe", 45, 0);
            weapon2 = new Weapon("Sword", 50, 0);
            weapon3 = new Weapon("Wand", 50, 0);
            barbarian1 = new Barbarian("Hannah", 100, 70,  weapon, shield);
            barbarian2 = new Barbarian("Luis", 100, 70,  weapon2, shield);
            wizard1 = new Wizard("Finn", 80, 150, weapon3, pet);
            item1 = new Weapon("Axe", 10, 0);
            item2 = new Potion("HP pot", 100, 0);
            potion = new Potion("HP pot", 100, 0);
            treasure = new Treasure();
            treasure.addItemToTreasure(item1);
            treasure.addItemToTreasure(item2);
        }

    @Test
    public void hasName(){
        assertEquals("Finn", wizard1.getName());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(50, wizard1.getAttackPower());
    }

    @Test
    public void hasDefensePower(){
        assertEquals(0, wizard1.getDefensePower());
    }

    @Test
    public void hasHP(){
        assertEquals(80, wizard1.getHp());
    }

    @Test
    public void hasMP(){
        assertEquals(150, wizard1.getMp());
    }

    @Test
    public void hasInventory(){
        assertEquals(0, wizard1.getInventory().size());
    }

    @Test
    public void canCollectTreasure(){
        wizard1.collectTreasure(treasure);
        assertEquals(2, wizard1.getInventory().size());
        assertEquals(0, treasure.getItems().size());
    }

    @Test
    public void canBasicAttack(){
        wizard1.basicAttack(barbarian2);
        assertEquals(70, barbarian2.getHp());

    }
    @Test
    public void canLightingStrike(){
        wizard1.lightingStrike(barbarian2);
        assertEquals(100, wizard1.getMp());
        assertEquals(20, barbarian2.getHp());

    }


}
