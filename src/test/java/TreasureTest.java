import fantasy.items.Item;
import fantasy.items.potion.Potion;
import fantasy.items.treasures.Treasure;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {
    Treasure treasure;
    Item item1, item2;

    @Before
    public void before(){
        item1 = new Weapon("Axe", 10, 0);
        item2 = new Potion("HP pot", 100, 0, 0, 0);
        treasure = new Treasure();
    }

    @Test
    public void hasItems(){
        assertEquals( 0, treasure.getItems().size());
    }

    @Test
    public void canAddItem(){
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
        assertEquals(2, treasure.getItems().size());
    }

    @Test
    public void canRemoveItem(){
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
        treasure.removeItemFromTreasure(item1);
        assertEquals(1, treasure.getItems().size());
    }

    @Test
    public void canRemoveAllItems(){
        treasure.addItemToTreasure(item1);
        treasure.addItemToTreasure(item2);
        assertEquals(2, treasure.getItems().size());
        treasure.removeAllItemsFromTreasure();
        assertEquals( 0, treasure.getItems().size());
    }
}
