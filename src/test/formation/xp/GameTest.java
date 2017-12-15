package formation.xp;

import junit.framework.TestCase;
import org.junit.Test;

public class GameTest extends TestCase {
    @Test
    public void testCreateGame() {
        Game testGame = new Game(new String[]{"Bob", "Cecile"});
        
        //create players
        assertEquals("définir nombre joueurs", 2, testGame.getNbPlayers());
        assertEquals("nom premier joueur", "Bob", testGame.getPlayer(0).getName());
        assertEquals("nom deuxième joueur", "Cecile", testGame.getPlayer(1).getName());
        assertNull("abscence troisième joueur", testGame.getPlayer(2));
        
        //start at round 1
        assertEquals("initialiser au tour 1", 1, testGame.getRound());
        
    }
}
