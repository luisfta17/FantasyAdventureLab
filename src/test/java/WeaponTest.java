import fantasy.items.potion.Potion;
import fantasy.items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Sword", 80, 0);
    }

    @Test
    public void hasWeaponName(){
        assertEquals("Sword", weapon.getName());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(80, weapon.getAttackPower());
    }

    @Test
    public void hasHealingPower(){
        assertEquals(0, weapon.getHealingPower());
    }
}
