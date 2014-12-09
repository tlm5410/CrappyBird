package app;

import java.awt.Image;
import java.awt.Toolkit;

public class Bird {
    int x;
    int y; 
    int diameter;
    int speed;
    Image birdImg;
    
    public Bird(int startX, int startY, int setSpeed){
        x= startX;
        y= startY;
        speed= setSpeed;
    }
    
    public void jump(){
        changeDirection();
        y = y - 100;
        changeDirection();
    }
    public void changeDirection(){
        speed = -speed;
    }
    
    public void reset(){
        
    }
    
    public Image getImage(){
        return birdImg;
    }
    
    public void ChangeImage(String newImage, int height, int width){
        birdImg= Toolkit.getDefaultToolkit().getImage(newImage).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        
    }
    
}
