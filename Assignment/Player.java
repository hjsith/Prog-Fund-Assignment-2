
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
        private int collectedDots;
        private int x;
        private int y;

    /**
     * Constructor for objects of class Player
     */
    public Player(int iniX, int iniY) {
        
        x = iniX;
        y = iniY;
        collectedDots = 0;
        
    }
    
    public void move(int dx, int dy) {
   
        x += dx;
        y += dy;
        
    }
    
    public void collect(Dot dot) {
        
        int dotX = dot.getDotX();
        int dotY = dot.getDotY();
        boolean exists = dot.verifyExist();
        
        if (x == dotX && y == dotY && exists == true) {
                        
            ++collectedDots;
            dot.disappear();
            
        }
        

    }
    
    public boolean conditionCheck() {
        
        if (collectedDots == 3 && x == 4 && y == 4) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public String toString() {
        
        int i;
        String stars = "";
        
        for (i = 0; i < collectedDots; ++i) {
            
            stars += "*";
            
        }
        
        if (collectedDots == 0) {
            
            return "Player[]" + Util.objectStr(x, y, true);
            
        } else {
            
            return "Player[" + stars + "]" + Util.objectStr(x, y, true);
            
        }
        
    }
}
