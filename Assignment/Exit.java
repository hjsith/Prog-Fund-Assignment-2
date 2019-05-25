
/**
 * Write a description of class Exit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exit
{
    private int x;
    private int y;
    private boolean closed;

    public Exit(int iniX, int iniY) {
        // initialise instance variables
        x = iniX;
        y = iniY;
        closed = true;
    }
    
    public void conditionsMet(boolean met) {
        closed = !met;
    }
    
    public String toString() {
        
       return "Exit" + Util.objectStr(x, y, closed);
       
    }

}
