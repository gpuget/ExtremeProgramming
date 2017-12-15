/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author malet
 */
public class PlayerTest extends TestCase {
    @Test
    public void testBet() {
        Player player = new Player("Bob");
        
        //mise possible
        int initialMoney = player.getMoney();
        assertTrue("mise faite", player.bet(1));
        assertEquals("monnaie restante", initialMoney - 1, player.getMoney());
        
        //mise impossible
        initialMoney = player.getMoney();
        assertFalse("mise non faite", player.bet(initialMoney + 1));
        assertEquals("monnaie restante", initialMoney, player.getMoney());
    }
}
