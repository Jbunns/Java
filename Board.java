import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.*;  

@SuppressWarnings("serial") //strong-arm compiler
public class Board extends JFrame
{


    private List<Card> cards;
    private Card selectedCard;
    private Card selection1; // selections
    private Card selection2;
    private Timer timer;

    public Board()
    {

        int pairs = 8;
        List<Card> cardsList = new ArrayList<Card>();
        List<ImageIcon> images = new ArrayList<ImageIcon>();
        
        ImageIcon stl = new ImageIcon("cards.jpg");
        ImageIcon chicago = new ImageIcon("cubs.jpg");
        ImageIcon miami = new ImageIcon("marlins.jpg");
        ImageIcon atl = new ImageIcon("braves.jpg");
        ImageIcon milw = new ImageIcon("brewers.jpg");
        ImageIcon cincy = new ImageIcon("reds.jpg");
        ImageIcon colo = new ImageIcon("rockies.jpg");
        ImageIcon washington = new ImageIcon("nationals.jpg");
        
        images.add(stl);
        images.add(chicago);
        images.add(miami);
        images.add(atl);
        images.add(milw);
        images.add(cincy);
        images.add(colo);
        images.add(washington);
        
        images.add(stl);
        images.add(chicago);
        images.add(miami);
        images.add(atl);
        images.add(milw);
        images.add(cincy);
        images.add(colo);
        images.add(washington);
        
        
        Collections.shuffle(images);
        

        for (ImageIcon pic : images) // for each
        {
            Card c = new Card();
            c.setId(pic);
            c.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    selectedCard = c;
                    flip();
                }
       		});
            cardsList.add(c);
        }
        this.cards = cardsList;
        timer = new Timer(500, new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                checkCards();
            }
        });

        timer.setRepeats(false);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 4));
        pane.setBackground(Color.black);
        for (Card c : cards) // for each
        {
            pane.add(c);
        }
        setTitle("Baseball Memory Match");
    }

    public void flip()
    {
        if (selection1 == null && selection2 == null)
        {
            selection1 = selectedCard;
            selection1.setIcon(selection1.getId());
        }

        if (selection1 != null && selection1 != selectedCard && selection2 == null)
        {
            selection2 = selectedCard;
            selection2.setIcon(selection2.getId());
            timer.start();

        }
    }

    public void checkCards()
    {
        if (selection1.getId() == selection2.getId())
        {
            selection1.setEnabled(false);
            selection2.setEnabled(false);
            selection1.setMatched(true); 
            selection2.setMatched(true);
            if (this.gameOver())
            {
                JOptionPane.showMessageDialog(this, "You won!");
                System.exit(0);
            }
        }

        else
        {
            selection1.setText(""); //'hides' text
            selection2.setText("");
        }
        selection1 = null; 
        selection2 = null;
    }

    public boolean gameOver()
    {
        for(Card c: this.cards)
        {
            if (c.getMatched() == false)
            {
                return false;
            }
        }
        return true;
    }

}