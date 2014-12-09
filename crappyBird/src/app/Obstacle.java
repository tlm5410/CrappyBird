package app;

public class Obstacle {
    int x;
    int y;
    int width;
    int height;
    final int gap = 100;
    
    public Obstacle(int startX, int startY, int H, int W){
        x= startX;
        y = startY;
        width = W;
        height = H;
        
        
    }
    
    public void moveObstacle(){
     x = x - 100;   
    }
}
