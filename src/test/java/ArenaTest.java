import fantasy.Arena;
import fantasy.characters.Barbarian;
import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Shield;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArenaTest {
    Barbarian barbarian1, barbarian2;
    Shield shield, shield2;
    Weapon weapon, weapon2;
    Treasure treasure;
    Item item1, item2;
    Potion potion;
    Arena arena;

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
        treasure = new Treasure();
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
        arena = new Arena(barbarian1, barbarian2, treasure);
    }

    @Test
    public void haveWinner(){
        barbarian1.megaStrike(barbarian2);
        barbarian1.basicAttack(barbarian2);
        barbarian1.basicAttack(barbarian2);
        arena.checkWinner();
        assertEquals(2, barbarian1.getInventory().size());
        assertEquals(-20, barbarian2.getHp());
        assertEquals(0, barbarian2.getInventory().size());
    }

    @Test
    public void haveWinner2(){
        barbarian2.megaStrike(barbarian1);
        barbarian2.basicAttack(barbarian1);
        barbarian2.basicAttack(barbarian1);
        arena.checkWinner();
        assertEquals(0, barbarian1.getInventory().size());
        assertEquals(2, barbarian2.getInventory().size());
        assertEquals(0, treasure.getItems().size());
    }

    @Test
    public void haveNoWinner(){
        barbarian1.megaStrike(barbarian2);
        barbarian1.basicAttack(barbarian2);
        arena.checkWinner();
        assertEquals(0, barbarian1.getInventory().size());
        assertEquals(0, barbarian2.getInventory().size());
    }

}
