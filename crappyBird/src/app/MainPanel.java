package app;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
    
    TitlePanel titlePanel = new TitlePanel();
    GamePanel gamePanel = new GamePanel();
    EndPanel endPanel = new EndPanel();
    
    public MainPanel (){
        setLayout(new GridLayout(3,1));
        add(titlePanel);
//       add(gamePanel);
        add(endPanel);
        
        endPanel.setVisible(false);
    }
}
