import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class GameDriver
{
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setTitle("Matching");
		window.setSize(400, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container thePane = window.getContentPane();
		
		GameCard GC1 = new GameCard();
		
		thePane.add(GC1);
		
		window.setVisible(true);
	}
	
}
