import fantasy.items.potion.Potion;
import fantasy.items.weapons.Shield;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShieldTest {

    Shield shield;

    @Before
    public void before(){
        shield = new Shield("Shield", 50);
    }

    @Test
    public void hasPotName(){
        assertEquals("Shield", shield.getName());
    }

    @Test
    public void hasHPRecovery(){
        assertEquals(50, shield.getDefensePower());
    }


}
