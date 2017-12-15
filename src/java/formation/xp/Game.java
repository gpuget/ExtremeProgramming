/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

/**
 *
 * @author malet
 */
public class Game {
    
    private Player[] players;
    private int round;
    private int totalBet;
        
    
    public Game(String[] playerNames) {
        players = new Player[playerNames.length];
        
        for (int i=0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
        
        round = 1;
        totalBet = 0;
    }
    
    public int getNbPlayers() {
        return players.length;
    }
    
    public int getRound() {
        return round;
    }
    
    public Player getPlayer(int positionPlayer) {
        if (positionPlayer >= 0 && positionPlayer < players.length) {
            return players[positionPlayer];
        }
        return null;
    }
    
    public int getTotalBet() {
        return totalBet;
    }
    
    public void bet(Player player, int amount) {
        if (player.bet(amount)) {
            totalBet += amount;
        }
    }
    
}
