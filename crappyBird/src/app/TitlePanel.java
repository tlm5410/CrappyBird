package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.*;

public class TitlePanel extends JPanel{
    
    JButton startGame,closeGame;
    JLabel background1;
    JLabel welcomeMessage;
    Image BackgroundImg;
    String Welcome;
    
    public TitlePanel(){
        
       BackgroundImg = Toolkit.getDefaultToolkit().getImage("img/bg.png").getScaledInstance(720, 640, Image.SCALE_DEFAULT);
       background1 = new JLabel(new ImageIcon(BackgroundImg));
       
       Welcome = "Welcome to Crappy Bird ";
       welcomeMessage = new JLabel(new String(Welcome));
       startGame = new JButton("Start Game");
       closeGame = new JButton("Close Game");
       
       add(background1);
       background1.setLayout(null);
       background1.add(startGame);
       background1.add(closeGame);
       background1.add(welcomeMessage);
       
       welcomeMessage.setBounds(new Rectangle(275,150,900,100));
       startGame.setBounds(new Rectangle(50,250,300,100));
       closeGame.setBounds(new Rectangle(375,250,300,100));

    }
       
    public void paintComponent(){

    }
    
    public void runGame(){
        
    }
}
