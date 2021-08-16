
package finalproject;

import java.util.Random;

public class Player {
    private int hitPoints;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int totalGold;
    // total gold is needed too - dont know where
    
    public Player(){
        int multiple = 3;
        Random rand = new Random();
        hitPoints = 20;
        strength = rand.nextInt(5 +1) * multiple;
        dexterity = rand.nextInt(5 +1) * multiple;
        intelligence = rand.nextInt(5 +1) * multiple;
        totalGold = 0;
        
        strength+= 1 * 3;
        dexterity+= 1 * 3;
        intelligence+= 1 * 3;
        
        
        
    }
  

     public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
       return strength;
    }
    public int getDexterity(){
       return dexterity;
    }
    public int getIntelligence(){
       return intelligence;
    }
    public int getTotalGold(){
        return totalGold;
    }
    
}
    
    
    
