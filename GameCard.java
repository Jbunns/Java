import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class GameCard extends JPanel
{
	public GameCard()
	{
		GridLayout theGrid = new GridLayout(4,4);
		setLayout(theGrid);
		
		JPanel[] card = new JPanel[8]; 
		ImageIcon[] theImage = new ImageIcon[8];
		
		for(int x = 0; x < 8; x++)
			{
				card[x] = new JPanel(); 
			}
			
			
		for(int x = 0; x < 8; x++)
			theImage[x] = new ImageIcon();
		
		theImage[0] = new ImageIcon("cards.jpg");
		theImage[1] = new ImageIcon("braves.jpg");
		theImage[2] = new ImageIcon("brewers.jpg");
		theImage[3] = new ImageIcon("reds.jpg");
		theImage[4] = new ImageIcon("cubs.jpg");
		theImage[5] = new ImageIcon("nationals.jpg");
		theImage[6] = new ImageIcon("rockies.jpg");
		theImage[7] = new ImageIcon("marlins.jpg");
	
		ArrayList<Integer> randOrder = getRandomNonRepeatingIntegers(0, card.length);
		
		for(int x = 0; x < card.length; x++)
		{
			card[x].add(new JLabel(theImage[randOrder.get(x)]));
			card[x].setBackground(Color.black);
			add(card[x]);
		}
	}
	
	/**
	 * Gets a random integer between the minimum (inclusive) and maximum (exclusive) values
	 */
	private int getRandomInt(int min, int max)
	{
		Random random = new Random();

  		return random.nextInt(max - min) + min;
	}

	/**
	 * Gets a shuffled ArrayList of the numbers between the minimum (inclusive) and
	 * maximum (exclusive) values
	 */
	private ArrayList<Integer> getRandomNonRepeatingIntegers(int min,int max)
	{
		int size = max - min;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		while (numbers.size() < size) 
		{
			int random = getRandomInt(min, max);

	        if (!numbers.contains(random)) 
	        {
	       		numbers.add(random);
	        }
	  	}
				
		return numbers;
	}
}