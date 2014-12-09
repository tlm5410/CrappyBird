package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GamePanel extends JPanel implements KeyListener, ActionListener{
   Bird crappyBird;
   Obstacle topObstacle, bottomObstacle;
   Timer timer;
   int score;
   JLabel background;
   JLabel playerPiece;
   JLabel ground;
   Image BackgroundImg;
   Image GroundImg;
   boolean collisionOccured;
   
   public GamePanel(){
    crappyBird = new Bird(100,100, -1);
    crappyBird.ChangeImage("img/bird.gif", 75, 75);
    
    playerPiece = new JLabel(new ImageIcon(crappyBird.birdImg));
    
    BackgroundImg = Toolkit.getDefaultToolkit().getImage("img/bg.png").getScaledInstance(720, 640, Image.SCALE_DEFAULT);
    GroundImg = Toolkit.getDefaultToolkit().getImage("img/ground.png").getScaledInstance(720, 640, Image.SCALE_DEFAULT);
    setLayout(new BorderLayout());
        background = new JLabel(new ImageIcon(BackgroundImg));
       
        add(background);
        
        ground.setLayout(null);
        background.setLayout(null);
        
        background.add(playerPiece);
        background.add(ground);
        ground.setBounds(new Rectangle(720,1725));
        playerPiece.setBounds(new Rectangle(crappyBird.x, crappyBird.y, 75, 75));
        
        
        timer = new Timer (1000/20,this);
        timer.start();
        
        addKeyListener(this);
        
        setVisible(true);
        setFocusable(true);
   }
   
   public void checkCollision(){
       
   }
   
   public void scollScreen(){
       
   }
   
   public void incrementScore(){
       
   }
   
   public void paintComponent(){
       
   }
   
   public void keyPressed(KeyEvent evt) {
        int kk = evt.getKeyCode();
        if(kk ==  KeyEvent.VK_SPACE) {
            crappyBird.jump();
            playerPiece.setBounds(new Rectangle(crappyBird.x, crappyBird.y, 75, 75));
        
        }
       // Rectangle playerA = new Rectangle(Player.getXpos(),Player.getYpos(),100,100);
        //Rectangle playerB= new Rectangle(car.getXpos(), car.getYpos(), 50, 500);
	//playerPiece.setBounds(playerA);
        
        /*if(playerA.isEmpty()){
            clock.stop();
            System.out.println("LOSER");
        }
                **/
        /*if(finishLine.getBounds().contains(Player.xPos+45, Player.yPos+45)){
                clock.stop();
                background.setVisible(false);
                remove(background);
                JLabel winner = new JLabel("YOU WON!!");
                winner.setHorizontalAlignment(JLabel.CENTER);
                winner.setFont(new Font("Serif", Font.PLAIN, 20));
                winner.setOpaque(true);
                winner.setBackground(Color.GREEN);
                add(winner);
                winner.setVisible(true);
                //Player.ChangeImage("images/blood.png", 100, 100); 
        */
        
   }
   public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==timer){
            crappyBird.y= crappyBird.y-(crappyBird.speed)*20;
            playerPiece.setBounds(new Rectangle(crappyBird.x, crappyBird.y, 75, 75));
        }
    }
   public void paintComponent(Graphics g)  //consider g as a pencil that is able to draw on the screen
	{
		super.paintComponent(g);
		requestFocusInWindow();
	}

    
    public void keyTyped(KeyEvent e) {
        
    }

    
    public void keyReleased(KeyEvent e) {
        
    }
}
   
