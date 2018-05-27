import fantasy.items.potion.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PotionTest {

    Potion potion;

    @Before
    public void before(){
        potion = new Potion("Green Potion", 50, 50, 0, 0);
    }

    @Test
    public void hasPotName(){
        assertEquals("Green Potion", potion.getName());
    }

    @Test
    public void hasHPRecovery(){
        assertEquals(50, potion.getHpRecovery());
    }

    @Test
    public void hasMPRecovery(){
        assertEquals(50, potion.getHpRecovery());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(0, potion.getAttackPower());
    }

    @Test
    public void hasDefensePoints(){
        assertEquals(0, potion.getDefensePoints());
    }
}
