package app;

import java.awt.*;
import javax.swing.*;

public class CrappyBird extends JFrame{
    JFrame GameFrame;
    MainPanel mainPanel;
    GamePanel start;
    
    public CrappyBird(){
        super ("Crappy Bird");
        mainPanel = new MainPanel();
        start = new GamePanel();
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel,"Center");
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (720, 640);
        setVisible(true);
        
                
    }
}
    