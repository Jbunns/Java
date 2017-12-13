import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class GameCard extends JPanel
{
	public GameCard()
	{
		JPanel[] card = new JPanel[8]; // panels on the board
		ImageIcon[] theImage = new ImageIcon[8];
		
		for(int x = 0; x < 8; x++)
			card[x] = new JPanel();
		
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
	
		card[0].add(new JLabel(theImage[0]));
		add(card[0]);
		
		/*for(int x = 0; x < 8; x++)
		{
			card[x].setBackground(Color.black);
			add(card[x]);
		} */
		
		/* this is my test for random
				public static int getRandomInt(int min, int max)
		{
			Random random = new Random();

    		return random.nextInt((max - min) + 1) + min;
		}

		public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,int max)
		{
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
		}*/
	}
}