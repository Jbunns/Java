import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class GameDriver
{
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setTitle("Matching");
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container thePane = window.getContentPane();
		GridLayout theGrid = new GridLayout(4,4);
		thePane.setLayout(theGrid);
		
		GameCard GC1 = new GameCard();
		
		thePane.add(GC1);
		
		window.setVisible(true);
	}
	
}
