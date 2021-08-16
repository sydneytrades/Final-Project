package finalproject;


import com.sun.media.jfxmedia.events.PlayerEvent;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;


public class FinalProjectController implements Initializable {
    
    private Player player; // for constructor below
    private Monster monster; // same as above
    
    private int totalGold; // for totalGoldLabel
    private int gold; // 3
    private int die; // random 20
    
    
    
  
    @FXML
    private TextArea textLog;
    @FXML
    private Button northButton;
    @FXML
    private Button westButton;
    @FXML
    private Button southButton;
    @FXML
    private Button eastButton;     
    @FXML
    private Label hitPointsPLabel;  
    @FXML
    private Label strengthPLabel;
    @FXML
    private Label dexterityPLabel;
    @FXML
    private Label intelligencePLabel;
    @FXML
    private Label monsterHitPointsLabel;
    @FXML
    private Label monsterStrengthLabel;
    @FXML
    private Label monsterDexterityLabel;
    @FXML
    private Label monsterIntelligenceLabel;
    @FXML
    private Label totalGoldLabel;
    
    
    public FinalProjectController(){  // constructor for classes
       player = new Player();
       monster = new Monster();
       Random rand = new Random();
       die = rand.nextInt(21);
       
       
    }
    
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        updateLabels();
     
    }

    @FXML
    private void runAwayButton(ActionEvent event) {
        if (die < monster.getIntelligenceMonster()){
       strengthPLabel.setText("Strength = " + (player.getStrength() / 2));
        }
       }

    @FXML
    private void fightBotton(ActionEvent event) {
        
        if (die >= monster.getDexterityMonster()){
                     
            textLog.appendText("You hit the monster \n");
            
        }
       monsterStrengthLabel.setText("Strength = " + (player.getStrength() / 3));
    }

    @FXML
    private void searchGoldButton(ActionEvent event) {
        
        if (die < player.getIntelligence()); {
            textLog.appendText("Gold found = 3 \n");
            totalGoldLabel.setText("Gold = " + (totalGold + 3 + "\n"));             
           }
        
        
      }

    @FXML
    private void sleepButton(ActionEvent event) {
        textLog.appendText("Take a break, sleep! \n");
        
    }

    @FXML
    private void northButtonClicked(ActionEvent event) {
        textLog.appendText("You are in a jungle\n");
    }

    @FXML
    private void westButtonClicked(ActionEvent event) {
        textLog.appendText("You are in a desert \n ");
    }

    @FXML
    private void southButtonClicked(ActionEvent event) {
        textLog.appendText("You are in a forest \n");
    }
    

    @FXML
    private void eastButtonClicked(ActionEvent event) {
        textLog.appendText("You are in a taiga \n");
    }
    
    private void updateLabels(){
        
        int hitpoints = player.getHitPoints();
        hitPointsPLabel.setText("Hit Points = " + hitpoints);
       
        int strength = player.getStrength();
        strengthPLabel.setText("Strength = " + strength);
        
        int dexterity = player.getDexterity();
        dexterityPLabel.setText("Dexterity = " + dexterity);
        
        int intelligence = player.getIntelligence();
        intelligencePLabel.setText("Intelligence = " + intelligence);
        
        int hitPointsMonster = monster.getHitPointsMonster();
        monsterHitPointsLabel.setText("Hit Points = " + hitPointsMonster);
        
        int strengthMonster = monster.getStrengthMonster();
        monsterStrengthLabel.setText("Strength = " + strengthMonster);
        
        int dexterityMonster = monster.getDexterityMonster();
        monsterDexterityLabel.setText("Dexterity = " + dexterityMonster);
        
        int intelligenceMonster = monster.getIntelligenceMonster();
        monsterIntelligenceLabel.setText("Intelligence = " + intelligenceMonster);
       
        int totalGold = player.getTotalGold();
        totalGoldLabel.setText("Gold = " + totalGold);
       
    }

    @FXML
    private void collectGoldButton(ActionEvent event) {
             
        
        
    }
    
}

  
    

    


