
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
    public Player(int iniX, int iniY)
    {

    
        x = iniX;
        y = iniY;
        collectedDots = 0;
    }
    
    public void move(int dx, int dy) {
        
        
        x += dx;
        y += dy;
        
    }
    
    public void collect(Dot dot) {
        
        if (this.x == 1 && this.y == 1) {
            ++collectedDots;
            dot.disappear();
        }
        
        else if (this.x == 2 && this.y == 2) {
            ++collectedDots;
            dot.disappear();
        }
        
        else if (this.x == 3 && this.y == 3) {
            ++collectedDots;
            dot.disappear();
        }
    }
    
    public String toString() {
       return "Player[" + collectedDots + "]" + Util.objectStr(x, y, true);
    }
}
