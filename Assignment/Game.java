
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private Dot dot1 = new Dot(1,1);
    private Dot dot2 = new Dot(2,2);
    private Dot dot3 = new Dot(3,3);
    private Player player;
    
    public Game(int x, int y)
    {
        // initialise instance variables
        player = new Player(x, y);
        
    }
    
    public void move(int dx, int dy) {
        
        player.move(dx, dy);
        player.collect(dot1);
        player.collect(dot2);
        player.collect(dot3);
        
    }

    public String toString() {
       return player + " " + dot1 + " " + dot2 + " " + dot3; 
    }
}
