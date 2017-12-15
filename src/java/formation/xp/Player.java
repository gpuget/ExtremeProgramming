/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

/**
 *
 * @author malet
 */
public class Player {
    private String name;
    private int money;
    
    public Player(String playerName) {
        name = playerName;
        money = 20000;
    }
    
    public String getName() {
        return name;
    }
    
    public int getMoney() {
        return money;
    }
    
    public boolean bet(int amount) {
        if (amount > money) {
            return false;
        }
        
        money -= amount;
        return true;
    }
}
