
/**
 * Write a description of class Dot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dot
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private boolean exists;

    /**
     * Constructor for objects of class Dot
     */
    public Dot(int iniX, int iniY)
    {
        // initialise instance variables
        this.x = iniX;
        this.y = iniY;
        this.exists = true;
    }
    
    public void disappear() {
        exists = false;
    }
    
    public String toString() {
       return "Dot" + Util.objectStr(x, y, exists); 
    }

}
