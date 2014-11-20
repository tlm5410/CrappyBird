package app;

import java.awt.Image;
import java.awt.Toolkit;

public class Bird {
    int x;
    int y; 
    int diameter;
    int speed;
    Image birdImg;
    
    public Bird(){
        
    }
    
    public void moveBird(int y){
        y= y;
    }
    
    public void jump(){
        
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
