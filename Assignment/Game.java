import java.util.Scanner;

public class Game
{
    private Dot dot1 = new Dot(1,1);
    private Dot dot2 = new Dot(2,2);
    private Dot dot3 = new Dot(3,3);
    private Exit exit = new Exit(4,4);
    private Player player;
    private Scanner scnr = new Scanner(System.in);
    
    public Game(int x, int y)
    {
        // initialise instance variables
        player = new Player(x,y);
        
    }
    
    public void move(int dx, int dy) {
        
        boolean conditionMet;
        
        player.move(dx, dy);
        player.collect(dot1);
        player.collect(dot2);
        player.collect(dot3);
        
        conditionMet = player.conditionCheck();
        exit.conditionsMet(conditionMet);
    }
    
    public void input() {
        System.out.print("Move (l/r/u/d): ");
        String line = scnr.nextLine();
        char answer = line.charAt(0);
        
        switch (answer)
        
        {
            case 'l':
            case 'L':
                move(-1, 0);
                break;
                
            case 'r':
            case 'R':
                move(1, 0);
                break;
                
            case 'u':
            case 'U':
                move(0, -1);
                break;
                
            case 'd':
            case 'D':
                move(0, 1);
                break;
                
            default:
                System.out.println("Invalid move");
                break;
        }
    }

    public String toString() {
       return player + " " + dot1 + " " + dot2 + " " + dot3 + " " + exit; 
    }
}
