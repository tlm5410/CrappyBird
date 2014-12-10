package app;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.*;

public class EndPanel extends JPanel{
    String loser;
    JButton playAgain,exitGame;
    JLabel background2;
    JLabel loserMessage;
    Image BackgroundImg;
    
    public EndPanel(){
        
       BackgroundImg = Toolkit.getDefaultToolkit().getImage("img/bg.png").getScaledInstance(720, 640, Image.SCALE_DEFAULT);
       background2 = new JLabel(new ImageIcon(BackgroundImg));
       
       loser = "SORRY YOU LOST";
       loserMessage = new JLabel(new String(loser));
       playAgain = new JButton("Play Again");
       exitGame = new JButton("Exit Game");
       
       add(background2);
       background2.setLayout(null);
       background2.add(playAgain);
       background2.add(exitGame);
       background2.add(loserMessage);
       
       loserMessage.setBounds(new Rectangle(275,150,900,100));
       playAgain.setBounds(new Rectangle(50,250,300,100));
       exitGame.setBounds(new Rectangle(375,250,300,100));
       
    }
    
    public void paintComponent(){

    }
    
    public void resetGame(){
        
    }
}
