import fantasy.characters.Barbarian;
import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian1, barbarian2;
    Shield shield, shield2;
    Weapon weapon, weapon2;
    Treasure treasure;
    Item item1, item2;
    Potion potion, potion2;

    @Before
    public void before(){
        shield = new Shield("Trinity", 20);
        shield2 = new Shield("Trinity2", 220);
        weapon = new Weapon("Axe", 45, 0);
        weapon2 = new Weapon("Sword", 50, 0);
        barbarian1 = new Barbarian("Hannah", 100, 70,  weapon, shield);
        barbarian2 = new Barbarian("Luis", 100, 70,  weapon2, shield);
        item1 = new Weapon("Axe", 10, 0);
        item2 = new Potion("HP pot", 100, 0, 0, 0);
        potion = new Potion("HP pot", 100, 0, 0, 0);
        potion2 = new Potion("MP pot", 0, 100, 0, 0);
        treasure = new Treasure();
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
    }

    @Test
    public void hasName(){
        assertEquals("Hannah", barbarian1.getName());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(45, barbarian1.getAttackPower());
    }

    @Test
    public void hasDefensePower(){
        assertEquals(20, barbarian1.getDefensePower());
    }

    @Test
    public void hasHP(){
        assertEquals(100, barbarian1.getHp());
    }

    @Test
    public void hasMP(){
        assertEquals(70, barbarian1.getMp());
    }

    @Test
    public void hasInventory(){
        assertEquals(0, barbarian1.getInventory().size());
    }

    @Test
    public void canCollectTreasure(){
        barbarian1.collectTreasure(treasure);
        assertEquals(2, barbarian1.getInventory().size());
        assertEquals(0, treasure.getItems().size());
    }

    @Test
    public void hasDefenseFormula(){
        assertEquals(10, barbarian2.defenseFormula());

    }
    @Test
    public void canBasicAttack(){
        barbarian1.basicAttack(barbarian2);
        assertEquals(65, barbarian2.getHp());

    }
    @Test
    public void canMegaStrike(){
        barbarian1.megaStrike(barbarian2);
        assertEquals(20, barbarian1.getMp());
        assertEquals(20, barbarian2.getHp());

    }
    @Test
    public void canDie(){
        barbarian1.megaStrike(barbarian2);
        assertEquals(true, barbarian2.isAlive());
        assertEquals(20, barbarian2.getHp());
        barbarian1.basicAttack(barbarian2);
        barbarian1.basicAttack(barbarian2);
        assertEquals(false, barbarian2.isAlive());
        assertEquals(0, barbarian2.getHp());
    }

    @Test
    public void canDrinkPotion(){
        barbarian1.megaStrike(barbarian2);
        assertEquals(20, barbarian2.getHp());
        barbarian2.drinkPotion(potion);
        assertEquals(100, barbarian2.getHp());

    }

    @Test
    public void canChangeWeapon(){
        barbarian2.setWeapon(weapon);
        assertEquals(weapon, barbarian2.getWeapon());
    }
    @Test
    public void canChangeShield(){
        barbarian2.setShield(shield2);
        assertEquals(shield2, barbarian2.getShield());
    }
    @Test
    public void lifeCantGoBelowZero(){
        barbarian1.megaStrike(barbarian2);
        barbarian1.basicAttack(barbarian2);
        barbarian1.basicAttack(barbarian2);
        assertEquals(0, barbarian2.getHp());
    }

    @Test
    public void canNotOverHeal(){
        barbarian1.drinkPotion(potion);
        assertEquals(100, barbarian1.getHp());
    }

    @Test
    public void canNotOverMp(){
        barbarian1.drinkPotion(potion2);
        assertEquals(70, barbarian1.getMp());
    }


}
