package app;

import javax.swing.*;

public class EndPanel extends JPanel{
    String loserMessage;
    JButton playAgain,exitGame;
    
    public EndPanel(){
        loserMessage = "Sorry you lost.";
        
        playAgain = new JButton("Play Again?");
        add(playAgain);
        
        exitGame = new JButton("Exit Game");
        add(exitGame);
    }
    
    public void paintComponent(){

    }
    
    public void resetGame(){
        
    }
}
