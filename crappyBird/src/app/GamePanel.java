package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GamePanel extends JPanel{
   Bird crappyBird;
   Obstacle topObstacle, bottomObstacle;
//   Timer timer;
   int score;
   boolean collisionOccured;
   
   public GamePanel(){
       
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
        if(kk ==  KeyEvent.VK_SPACE) {crappyBird.moveBird(crappyBird.y+50);}
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
}
   
