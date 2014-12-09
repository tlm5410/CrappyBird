package app;

import javax.swing.*;

public class TitlePanel extends JPanel{
    String welcomeMessage;
    JButton startGame,closeGame;
    
    public TitlePanel(){
        
        welcomeMessage = "Welcome to Crappy Bird";
        
        startGame = new JButton("Start Game");
        add(startGame);
        
        closeGame = new JButton("Close Game");
        add(closeGame);
    }
       
    public void paintComponent(){

    }
    
    public void runGame(){
        
    }
}
