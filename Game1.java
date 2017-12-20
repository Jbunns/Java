
import java.awt.Dimension;
import javax.swing.JFrame;


public class Game1
{
    public static void main(String[] args)
    {
        Board theBoard = new Board();
        theBoard.setPreferredSize(new Dimension(500,500)); 
    	theBoard.setLocation(500, 250);
        theBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theBoard.pack(); //sizing
        
        theBoard.setVisible(true);
    }   
}